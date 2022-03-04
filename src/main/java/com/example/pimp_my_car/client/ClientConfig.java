package com.example.pimp_my_car.client;

import com.example.pimp_my_car.contrat.Contrat;
import com.example.pimp_my_car.contrat.ContratRepository;
import com.example.pimp_my_car.produit.Produit;
import com.example.pimp_my_car.produit.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            ProduitRepository produitRepository,
            ContratRepository contratRepository
    ) {
        return args -> {
            clientRepository.saveAll(
                    List.of(
                            new Client(
                                    "MacGauhy",
                                    "Robinetta",
                                    "rmacgauhy0@tumblr.com",
                                    "test",
                                    1
                            ),
                            new Client (
                                    "Feather",
                                    "Lil",
                                    "lfeather1@mit.edu",
                                    "test",
                                    2
                            ),
                            new Client (
                                    "Djordjevic",
                                    "Isak",
                                    "idjordjevic2@xing.com",
                                    "test",
                                    3
                            ),
                            new Client (
                                    "Chardin",
                                    "Myranda",
                                    "mchardin3@google.com.au",
                                    "test",
                                    4
                            ),
                            new Client (
                                    "Rubinowitz",
                                    "Koressa",
                                    "krubinowitz4@homestead.com",
                                    "test",
                                    0
                            ),
                            new Client (
                                    "Le Grice",
                                    "Joshua",
                                    "jlegrice5@blogs.com",
                                    "test",
                                    1
                            ),
                            new Client (
                                    "Goaley",
                                    "Erda",
                                    "egoaley6@vkontakte.ru",
                                    "test",
                                    2
                            ),
                            new Client (
                                    "Mounter",
                                    "Hilliard",
                                    "hmounter7@w3.org",
                                    "test",
                                    3
                            ),
                            new Client (
                                    "Gerrell",
                                    "Britt",
                                    "bgerrell8@harvard.edu",
                                    "test",
                                    4
                            ),
                            new Client (
                                    "Littrell",
                                    "Corrie",
                                    "clittrell9@nifty.com",
                                    "test",
                                    0
                            ),
                            new Client (
                                    "Apfelmann",
                                    "Herby",
                                    "hapfelmanna@friendfeed.com",
                                    "test",
                                    1
                            ),
                            new Client (
                                    "Boskell",
                                    "Brodie",
                                    "bboskellb@yolasite.com",
                                    "test",
                                    2
                            ),
                            new Client (
                                    "Tummond",
                                    "Gavan",
                                    "gtummondc@nbcnews.com",
                                    "test",
                                    3
                            ),
                            new Client (
                                    "Sebring",
                                    "Odilia",
                                    "osebringd@oaic.gov.au",
                                    "test",
                                    4
                            ),
                            new Client (
                                    "Risson",
                                    "Otes",
                                    "orissone@blogtalkradio.com",
                                    "test",
                                    0
                            ),
                            new Client (
                                    "Putman",
                                    "Evy",
                                    "eputmanf@amazon.com",
                                    "test",
                                    1
                            ),
                            new Client (
                                    "Whitmarsh",
                                    "Mariquilla",
                                    "mwhitmarshg@deliciousdays.com",
                                    "test",
                                    2
                            ),
                            new Client (
                                    "Azemar",
                                    "Josias",
                                    "jazemarh@oracle.com",
                                    "test",
                                    3
                            ),
                            new Client (
                                    "Keneforde",
                                    "Martino",
                                    "mkenefordei@myspace.com",
                                    "test",
                                    4
                            ),
                            new Client (
                                    "Wimlett",
                                    "Anderea",
                                    "awimlettj@mayoclinic.com",
                                    "test",
                                    0
                            ),
                            new Client (
                                    "Petkovic",
                                    "Paulita",
                                    "ppetkovick@virginia.edu",
                                    "test",
                                    1
                            ),
                            new Client (
                                    "Newcomen",
                                    "Maudie",
                                    "mnewcomenl@xrea.com",
                                    "test",
                                    2
                            ),
                            new Client (
                                    "Onion",
                                    "Anabella",
                                    "aonionm@google.com.br",
                                    "test",
                                    3
                            ),
                            new Client (
                                    "Inkpin",
                                    "Angela",
                                    "ainkpinn@istockphoto.com",
                                    "test",
                                    4
                            ),
                            new Client (
                                    "Porter",
                                    "Annalise",
                                    "aportero@umn.edu",
                                    "test",
                                    0
                            )
                    )
            );

            produitRepository.saveAll(
                    List.of(
                            new Produit (
                                    "embrayage",
                                    500f

                            ),
                            new Produit (
                                    "culasse",
                                    300f
                            )
                            ,
                            new Produit (
                                    "moteur",
                                    1000f
                            ),
                            new Produit (
                                    "jente",
                                    250f
                            ),
                            new Produit (
                                    "ampoule",
                                    15f
                            ),
                            new Produit(
                                    "injecteur",
                                    200f
                            ),
                            new Produit (
                                    "turbo",
                                    500f
                            ),
                            new Produit (
                                    "bougie",
                                    400f
                            ),
                            new Produit (
                                    "démarreur",
                                    150f
                            ),
                            new Produit (
                                    "pare-choc avant",
                                    100f
                            )
                    )
            );

            contratRepository.saveAll(
                    List.of(
                            new Contrat (
                                    "contrat_cadre1",
                                    5
                            ),
                            new Contrat(
                                    "contrat_cadre2",
                                    10
                            )
                            ,
                            new Contrat (
                                    "contrat_cadre3",
                                    15
                            ),
                            new Contrat (
                                    "contrat_cadre4",
                                    20
                            ),
                            new Contrat (
                                    "contrat_cadre5",
                                    25
                            )
                    )
            );

        };
    }

}
