package be.tftic.java;

import be.tftic.java.models.*;
import be.tftic.java.repository.EnclosMultipleRepository;
import be.tftic.java.repository.EnclosRepository;
import be.tftic.java.repository.EnclosSimpleRepository;
import be.tftic.java.repository.EspeceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dino_db");

        EnclosRepository enclosRepo = new EnclosRepository(emf);
        EnclosSimpleRepository esr = new EnclosSimpleRepository(emf);
        EnclosMultipleRepository emr = new EnclosMultipleRepository(emf);
        EspeceRepository especeRepo = new EspeceRepository(emf);

        List<EnclosSimple> enclosSimples = esr.findAll();
        List<EnclosMultiple> enclosMultiples = emr.findAll();

        System.out.println("-- Enclos simple -- ");
        enclosSimples.forEach(System.out::println);

        System.out.println("-- Enclos multiple -- ");
        enclosMultiples.forEach(System.out::println);

        emf.close();
    }
}
