package git.com.HokeRoadToHell.person;

import git.com.HokeRoadToHell.model.Persons;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "person") // Název tabulky v databázi, do které bude tato entita mapována.
public class Person extends Persons {

    // Atribut telephone slouží k uchování telefonního čísla vlastníka.
    @Column(name = "address")
    @NotBlank // Validace - telefonní číslo nesmí být prázdné
    private String address;

    @Column(name = "city")
    @NotBlank // Validace - telefonní číslo nesmí být prázdné
    private String city;

    @Column(name = "telephone")
    @NotBlank // Validace - telefonní číslo nesmí být prázdné
    @Digits(fraction = 0, integer = 10) // Validace - telefonní číslo musí být číselné a maximálně 10 číslic dlouhé
    private String telephone;


    // Metoda getAddress() slouží k získání hodnoty atributu address.
    public String getAddress() {
        return this.address;
    }

    // Metoda setAddress() slouží k nastavení hodnoty atributu address.
    public void setAddress(String address) {
        this.address = address;
    }

    // Metoda getCity() slouží k získání hodnoty atributu city.
    public String getCity() {
        return this.city;
    }

    // Metoda setCity() slouží k nastavení hodnoty atributu city.
    public void setCity(String city) {
        this.city = city;
    }

    // Metoda getTelephone() slouží k získání hodnoty atributu telephone.
    public String getTelephone() {
        return this.telephone;
    }

    // Metoda setTelephone() slouží k nastavení hodnoty atributu telephone.
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Metoda toString() vrací textovou reprezentaci objektu Owner.
    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", this.getId())
                .append("new", this.isNew())
                .append("lastName", this.getLastName())
                .append("firstName", this.getFirstName())
                .append("address", this.address)
                .append("city", this.city)
                .append("telephone", this.telephone)
                .toString();
    }


}
