package be.tftic.java.repository;

import be.tftic.java.AbstractRepository;
import be.tftic.java.models.EnclosMultiple;
import jakarta.persistence.EntityManagerFactory;

public class EnclosMultipleRepository extends AbstractRepository<EnclosMultiple, Long> {

    public EnclosMultipleRepository(EntityManagerFactory emf) {
        super(emf, EnclosMultiple.class);
    }

    @Override
    protected Long getId(EnclosMultiple enclosMultiple) {
        return enclosMultiple.getId();
    }
}
