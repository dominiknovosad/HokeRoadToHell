package git.com.HokeRoadToHell.doctor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "doctor") // Název tabulky v databázi, do které bude tato entita mapována.
public class Doctor  {

    @Id
    private Integer id;
    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "surname")
    @NotNull
    private String surname;

    @Column(name = "telephone")
    @NotNull
    @Digits(fraction = 0, integer = 10) // Validace - telefonní číslo musí být číselné a maximálně 10 číslic dlouhé
    private String telephone;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "clinic_id")
    @NotNull
    private Integer clinic_id;

    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", this.getId())
                .append("name", this.getName())
                .append("surname", this.getSurname())
                .append("telephone", this.getTelephone())
                .append("email", this.getEmail())
                .append("clinic_id", this.getClinicId())
                .toString();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getTelephone() {
        return this.telephone;
    }
    // Metoda setTelephone() slouží k nastavení hodnoty atributu telephone.
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    // Metoda getCity() slouží k získání hodnoty atributu city.
    public String getEmail() {
        return this.email;
    }
    // Metoda setCity() slouží k nastavení hodnoty atributu city.
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getClinicId() {
        return clinic_id;
    }
    public void setClinicId(Integer clinic_id) {
        this.clinic_id= clinic_id;
    }

}
