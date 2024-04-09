package be.tftic.java.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("1")
public class EnclosMultiple extends Enclos {

    @OneToMany(mappedBy = "enclosMultiple")
    private List<Espece> especes;

}
