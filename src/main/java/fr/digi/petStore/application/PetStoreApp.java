package fr.digi.petStore.application;

import fr.digi.petStore.*;

import javax.persistence.*;
import java.util.List;

public class PetStoreApp {

    public static void main( String[] args ) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("tp-eval");
        EntityManager em= emf.createEntityManager();

        System.out.println(em);

        EntityTransaction et = em.getTransaction();

        et.begin();

       /* PetStore petStore= new PetStore();
        petStore.setName("Botanic");
        petStore.setManagerName("Dupont");

        PetStore petStore1= new PetStore();
        petStore1.setName("JardiLand");
        petStore1.setManagerName("Dupret");

        PetStore petStore2= new PetStore();
        petStore2.setName("Animalerie amazonie");
        petStore2.setManagerName("Durand");

        Adresse adresse= new Adresse();
        adresse.setNumber(15);
        adresse.setStreet("rue de la foret");
        adresse.setZipCode(34830);
        adresse.setCity("Clapier");

        petStore.setAdresse(adresse);

        Adresse adresse1= new Adresse();
        adresse1.setNumber(18);
        adresse1.setStreet("rue du parc");
        adresse1.setZipCode(34830);
        adresse1.setCity("Clapier");

        petStore1.setAdresse(adresse1);

        Adresse adresse2= new Adresse();
        adresse2.setNumber(25);
        adresse2.setStreet("rue de la nuit");
        adresse2.setZipCode(34000);
        adresse2.setCity("Montpellier");

        petStore2.setAdresse(adresse2);

        em.persist(adresse);
        em.persist(adresse1);
        em.persist(adresse2);

        em.persist(petStore);
        em.persist(petStore1);
        em.persist(petStore2);*/

        /*PetStore petStore= em.find(PetStore.class,8l);

        Animal animal= em.find(Animal.class,2l);

        animal.setPetStore(petStore);

        em.persist(animal);

        /*Cat cat= new Cat();
        Calendar cal= Calendar.getInstance();
        cal.set(2020,2,15);
        Date birth= cal.getTime();

        cat.setBirth(birth);
        cat.setColor("gris tigré");
        cat.setPetStore(petStore);

        Fish fish= new Fish();

        fish.setColor("argenté");
        fish.setPetStore(petStore1);
        fish.setLivingPlace(FishEnv.FRESH_WATER);*/

       /* Product product= new Product();
        product.setCode("22455kll");
        product.setLabel("Jeux pour chat");
        product.setPrice(15.99);
        product.setType(ProdType.ACCESSORY);*/

        /*PetStore petStore= em.find(PetStore.class,7l);
        Product product= em.find(Product.class,1l);
        Product product1= em.find(Product.class,2l);
        petStore.addProducts(product);
        petStore.addProducts(product1);*/

        /*Product product= em.find(Product.class,3l);

        PetStore petStore= em.find(PetStore.class,8l);
        PetStore petStore1= em.find(PetStore.class,9l);

        petStore.addProducts(product);
        petStore1.addProducts(product);*/

        TypedQuery<Animal> animals= em.createQuery("SELECT A FROM  Animal A JOIN A.petStore P WHERE P.name='JardiLand'",Animal.class);

       List<Animal> animalList=  animals.getResultList();

       System.out.println("------------------- Liste des animaux de l'animalerie -----------------");

        for (Animal animal:animalList) {

            System.out.println(animal);

        }

        System.out.println("--------------------------------------------------------");


       et.commit();
    }


}
