package be.tftic.java.models;

import be.tftic.java.WithId;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "enclos_multiple", discriminatorType = DiscriminatorType.INTEGER)
public class Enclos implements WithId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enclos_id")
    private Long id;
    @Column(name = "enclos_nom", nullable = false)
    private String nom;
    @Column(name = "enclos_taille", nullable = false)
    private int taille;

    @OneToMany(mappedBy = "enclos")
    private Set<Dino> dinos;

    @ManyToMany(mappedBy = "enclos")
    private Set<Employe> employes;

    @Override
    public String toString() {
        return "Enclos{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", taille=" + taille +
                '}';
    }
}
