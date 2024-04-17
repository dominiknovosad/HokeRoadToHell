package git.com.HokeRoadToHell.clinic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "clinic") // Název tabulky v databázi, do které bude tato entita mapována.
public class Clinic  {

    @Id
    private Integer id;
    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "city")
    @NotNull
    private String city;

    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", this.getId())
                .append("name", this.getName())
                .append("city", this.getCity())
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

}
