package be.tftic.java.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enclos {

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

    @OneToOne
    @JoinColumn(name = "espece_enclos_id", nullable = false)
    private Espece espece;
}
