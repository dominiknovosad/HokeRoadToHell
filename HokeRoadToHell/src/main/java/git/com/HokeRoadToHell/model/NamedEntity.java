package git.com.HokeRoadToHell.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;


// Třída NamedEntity rozšiřuje třídu BaseEntity a přidává k ní jméno jako další atribut.
// Tato třída bude mapována do databáze jako entita s primárním klíčem a atributem pro jméno.

// Anotace @MappedSuperclass označuje NamedEntity jako abstraktní třídu, která poskytuje společné vlastnosti pro ostatní entity.
@MappedSuperclass
public class NamedEntity extends BaseEntity {

    // Atribut name slouží k uchování jména entity.
    @Column(name = "name")
    private String name;

    // Metoda getName() slouží k získání hodnoty atributu name.
    public String getName() {
        return this.name;
    }

    // Metoda setName() slouží k nastavení hodnoty atributu name.
    public void setName(String name) {
        this.name = name;
    }

    // Přepsaná metoda toString() vrací jméno entity.
    @Override
    public String toString() {
        return this.getName();
    }
}
