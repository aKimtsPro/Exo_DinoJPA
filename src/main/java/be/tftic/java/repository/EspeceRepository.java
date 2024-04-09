package be.tftic.java.repository;

import be.tftic.java.AbstractRepository;
import be.tftic.java.models.Espece;
import jakarta.persistence.EntityManagerFactory;

public class EspeceRepository extends AbstractRepository<Espece, Long> {

    public EspeceRepository(EntityManagerFactory emf) {
        super(emf, Espece.class);
    }

    @Override
    protected Long getId(Espece espece) {
        return espece.getId();
    }
}
