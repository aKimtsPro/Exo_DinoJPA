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
public class Espece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "espece_id")
    private Long id;

    @Column(name = "espece_nom", nullable = false)
    private String nom;

    @Enumerated(EnumType.STRING) // => alimentation VARCHAR
//    @Enumerated(EnumType.ORDINAL) // => alimentation smallint (ordinal) (default)
    @Column(name = "espece_alimentation", nullable = false)
    private Alimentation alimentation;

    @OneToMany(mappedBy = "espece")
    private Set<Dino> dinos;

    @OneToOne(mappedBy = "espece")
    private Enclos enclos;

}
