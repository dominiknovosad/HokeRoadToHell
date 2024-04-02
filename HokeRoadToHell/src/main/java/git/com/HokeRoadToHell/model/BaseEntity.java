package git.com.HokeRoadToHell.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public class BaseEntity implements Serializable {

    // Atribut id je primárním klíčem entity.
    @Id
    // Anotace @GeneratedValue určuje strategii generování hodnoty primárního klíče.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Metoda getId() slouží k získání hodnoty atributu id.
    public Integer getId() {
        return id;
    }

    // Metoda setId() slouží k nastavení hodnoty atributu id.
    public void setId(Integer id) {
        this.id = id;
    }

    // Metoda isNew() kontroluje, zda je entita nová (tedy jestli ještě nemá přiděleno žádné ID).
    // Vrací true, pokud id má hodnotu null, jinak vrací false.
    public boolean isNew() {
        return this.id == null;
    }
}
