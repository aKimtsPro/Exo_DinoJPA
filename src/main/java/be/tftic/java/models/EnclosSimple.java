package be.tftic.java.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("0")
public class EnclosSimple extends Enclos {

    @OneToOne
    @JoinColumn(name = "enclos_s_espece")
    private Espece espece;

}
