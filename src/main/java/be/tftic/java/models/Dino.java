package be.tftic.java.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dino")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dino_id")
    private Long id;

    @Column(name = "dino_nom", nullable = false)
    private String nom;

    @Column(name = "dino_sexe", nullable = false)
    private String sexe;

    @ManyToOne
    @JoinColumn(name = "dino_espece_id", nullable = false)
    private Espece espece;

    @ManyToOne
    @JoinColumn(name = "dino_enclos_id", nullable = false)
    private Enclos enclos;

}
