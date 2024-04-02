package git.com.HokeRoadToHell.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;

// Třída Person rozšiřuje třídu BaseEntity a přidává k ní atributy pro křestní jméno a příjmení.
// Tato třída bude mapována do databáze jako entita s primárním klíčem a atributy pro křestní jméno a příjmení.

// Anotace @MappedSuperclass označuje Person jako abstraktní třídu, která poskytuje společné vlastnosti pro ostatní entity.
@MappedSuperclass
public class Persons extends BaseEntity {

    // Atribut firstName slouží k uchování křestního jména osoby.
    @Column(name = "first_name")
    @NotBlank // Validace - křestní jméno nesmí být prázdné
    private String firstName;

    // Atribut lastName slouží k uchování příjmení osoby.
    @Column(name = "last_name")
    @NotBlank // Validace - příjmení nesmí být prázdné
    private String lastName;

    // Metoda getFirstName() slouží k získání hodnoty atributu firstName.
    public String getFirstName() {
        return this.firstName;
    }

    // Metoda setFirstName() slouží k nastavení hodnoty atributu firstName.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Metoda getLastName() slouží k získání hodnoty atributu lastName.
    public String getLastName() {
        return this.lastName;
    }

    // Metoda setLastName() slouží k nastavení hodnoty atributu lastName.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
