package com.example.ihssane.autres;


import com.example.ihssane.model.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.provider.HibernateUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Configuration
public class PanierConfigue {
    public void close(){

    }
   /* @Bean
    CommandLineRunner commandLineRunner(IPanierRepository repository, UtilisateurRepositry utiliREp, IPanierBDRepositry bdRepositry, DonRepo donRepo){


        return  args -> {

            Utilisateur u1 = new Utilisateur("zirari", "Nada", "n123", "nada@gmail.com", "casa", new Date("2000/12/04"), "06142314");
            Utilisateur u2 = new Utilisateur("rasi", "Ahemade", "n123", "Ahemad@gmail.com", "casa", new Date("2000/12/04"), "06142314");

            utiliREp.saveAll(List.of(u1,u2));
            HashSet<PanierBD> hs= new HashSet<>();
            Don d1 = new Don();
            Don d2 = new Don();

            donRepo.saveAll(List.of(d1,d2));
            PanierBD pnBD1 =new PanierBD(d1, EtatDemande._____);
            bdRepositry.saveAll(List.of(pnBD1));
            hs.add(pnBD1);
            Panier pn = new Panier(u1,hs);
            repository.saveAndFlush(pn);



        };


}*/}