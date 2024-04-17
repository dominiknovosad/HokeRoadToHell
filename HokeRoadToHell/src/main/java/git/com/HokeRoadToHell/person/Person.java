package git.com.HokeRoadToHell.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "person") // Název tabulky v databázi, do které bude tato entita mapována.
public class Person  {

    @Id
    private Integer id;
    @Column(name = "first_name")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    private String firstname;

    @Column(name = "last_name")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    private String lastname;

    // Atribut telephone slouží k uchování telefonního čísla vlastníka.
    @Column(name = "address")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    private String address;

    @Column(name = "city")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    private String city;

    @Column(name = "telephone")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    @Digits(fraction = 0, integer = 10) // Validace - telefonní číslo musí být číselné a maximálně 10 číslic dlouhé
    private String telephone;

    @Column(name = "doctor_id")
    @NotNull // Validace - telefonní číslo nesmí být prázdné
    private Integer doctor_id;

    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", this.getId())
                .append("lastName", this.getLastname())
                .append("firstName", this.getFirstname())
                .append("address", this.getAddress())
                .append("city", this.getCity())
                .append("telephone", this.getTelephone())
                .append("doctor_id", this.getDoctorid())
                .toString();
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getDoctorid() {
        return doctor_id;
    }

    public void setDoctorid(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

}
