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
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employe_id")
    private Long id;
    @Column(name = "employe_nom", nullable = false)
    private String nom;
    @Column(name = "employe_prenom", nullable = false)
    private String prenom;

    @ManyToMany
    @JoinTable(
            name = "employe_affectation",
            joinColumns = @JoinColumn(name = "employe_id"),
            inverseJoinColumns = @JoinColumn(name = "enclos_id")
    )
    private Set<Enclos> enclos;

}
