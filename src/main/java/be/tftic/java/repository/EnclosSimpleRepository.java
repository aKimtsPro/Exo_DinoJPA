package be.tftic.java.repository;

import be.tftic.java.AbstractRepository;
import be.tftic.java.models.EnclosSimple;
import jakarta.persistence.EntityManagerFactory;

public class EnclosSimpleRepository extends AbstractRepository<EnclosSimple, Long> {

    public EnclosSimpleRepository(EntityManagerFactory emf) {
        super(emf, EnclosSimple.class);
    }

    @Override
    protected Long getId(EnclosSimple enclosSimple) {
        return enclosSimple.getId();
    }
}
