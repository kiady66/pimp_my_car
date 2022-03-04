package com.example.pimp_my_car.client;

import com.example.pimp_my_car.contrat.Contrat;
import com.example.pimp_my_car.contrat.ContratRepository;
import com.example.pimp_my_car.produit.Produit;
import com.example.pimp_my_car.produit.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

@RestController
public class ClientController {

    private final ClientService clientService;
    private final ProduitRepository produitRepository;
    private final ContratRepository contratRepository;
    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientService clientService, ProduitRepository produitRepository, ContratRepository contratRepository, ClientRepository clientRepository) {
        this.clientService = clientService;
        this.produitRepository = produitRepository;
        this.contratRepository = contratRepository;
        this.clientRepository = clientRepository;
    }

    @GetMapping
    @ResponseBody
    public String index()
    {
        List<Client> clientList = this.clientRepository.findAll();
        List<Produit> produiList = this.produitRepository.findAll();
        List<Contrat> contratList = this.contratRepository.findAll();

        ListIterator<Client> clientListIterator = clientList.listIterator();
        ListIterator<Produit> produitListIterator = produiList.listIterator();
        ListIterator<Contrat> contratListIterator = contratList.listIterator();

        String htmlTab = "";

        while (produitListIterator.hasNext())
        {
            htmlTab = htmlTab + "<tr><td>" + produitListIterator.next().getNomProduit()
                    + "</td>" + "<td>" + produitListIterator.next().getPrixProduit() + "</td></tr>";
        }


        return "<html>\n"
                    + "<header><title>Welcome</title><style>\n" +
                    "table,tr,th,td{border:1px solid #cccccc}\n" +
                    "</style> </header>\n" +
                    "<body>\n"
                        + "Hello world\n"
                        + "<table> "
                            + "<thead>"
                                + "<tr>"
                                    + "<th> Nom produit </th>"
                                    + "<th> Prix produit </th>"
                                + "</tr>"
                            + "</thead>"
                            + "<tbody>"
                                + "<tr>"
                                    + "<td> Nom produit </td>"
                                    + "<td> Prix produit </td>"
                                + "</tr>"
                            + "</tbody>"
                        + "</table>" +
                    "</body>\n" +
                "</html>";
    }

    @RequestMapping(path = "api/v1/client/authentication")
    public Map<String, String> authentication(@RequestBody Client client)
    {
        return clientService.authentication(client);
    }

    @RequestMapping(path = "api/v1/client")
    public List<Client> getClient()
    {
        return clientService.getClient();
    }
}
