package be.tftic.java.repository;

import be.tftic.java.AbstractRepository;
import be.tftic.java.models.Enclos;
import jakarta.persistence.EntityManagerFactory;

public class EnclosRepository extends AbstractRepository<Enclos, Long> {
    public EnclosRepository(EntityManagerFactory emf) {
        super(emf, Enclos.class);
    }

    @Override
    protected Long getId(Enclos enclos) {
        return enclos.getId();
    }
}
