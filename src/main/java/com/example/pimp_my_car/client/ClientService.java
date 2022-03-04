package com.example.pimp_my_car.client;

import com.example.pimp_my_car.contrat.Contrat;
import com.example.pimp_my_car.contrat.ContratRepository;
import com.example.pimp_my_car.produit.Produit;
import com.example.pimp_my_car.produit.ProduitRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    private ProduitRepository produitRepository;
    private ContratRepository contratRepository;

    public ClientService(ClientRepository clientRepository, ProduitRepository produitRepository, ContratRepository contratRepository) {
        this.clientRepository = clientRepository;
        this.produitRepository = produitRepository;
        this.contratRepository = contratRepository;
    }

    public List<Client> getClient()
    {
        return clientRepository.findAll();
    }

    public Map<String, String> authentication(Map<String, String> data)
    {
        Optional<Client> clientCheck = clientRepository
                .checkIdentification(data.get("emailClient"), data.get("mdpClient"));

        HashMap<String, String> response = new HashMap<>();

        if (clientCheck.isPresent())
        {
            LocalDateTime currentTime = LocalDateTime.now();
            LocalDateTime newExpirationDate = currentTime.plusHours(1);
            String newAccessToken = this.randomString();
            clientCheck.get().setExpirationDate(newExpirationDate);
            clientCheck.get().setAccessToken(newAccessToken);
            clientRepository.save(clientCheck.get());
            response.put("message", "connexion réussi");
            response.put("access-token", newAccessToken);
            return response;
        }

        response.put("message", "les identifiants saisis ne sont pas corrects");

        return response;
    }


    public Map<String, String> dashboard(Map<String, String> accessInformation)
    {
        Optional<Client> clientCheck =
                clientRepository.checkAccessToken(
                        accessInformation.get("emailClient"),
                        accessInformation.get("accessToken")
                );

        HashMap<String, String> response = new HashMap<>();

        if (clientCheck.isPresent())
        {

            if (LocalDateTime.now().isBefore(clientCheck.get().getExpirationDate()))
            {
                List<Produit> produiList = this.produitRepository.findAll();
                ListIterator<Produit> produitListIterator = produiList.listIterator();
                Optional<Contrat> clientContrat = contratRepository.findById(clientCheck.get().getIdContrat());

                Contrat contrat = clientContrat.get();

                while (produitListIterator.hasNext())
                {
                    Produit produitCourant = produitListIterator.next();
                    double prix = produitCourant.getPrixProduit()
                            + (produitCourant.getPrixProduit() * (contrat.getMargeContrat() / 100));

                    response.put(produitCourant.getNomProduit(), String.valueOf(prix));
                }

                response.put("marge", String.valueOf(1651.55));

                return response;
            }

            response.put("message", "votre session a expiré, veuillez vous reconnecter");
            return response;
        }

        response.put("message", "mauvais token, veuillez vous reconnecter");

        return response;
    }



    public String randomString()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 7;

        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }

}
