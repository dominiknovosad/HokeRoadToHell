package git.com.HokeRoadToHell.pet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import org.springframework.core.style.ToStringCreator;

import java.util.Date;

@Entity
@Table(name = "pets") // Název tabulky v databázi, do které bude tato entita mapována.
public class Pet  {

    @Id
    private Integer id;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "birth_date")
    @NotBlank // Validace - nesmí být prázdné
    private Date birthdate;

    @Column(name = "type_id")
    @NotBlank
    private Integer type_id;

    @Column(name = "owner_id")
    @NotBlank
    private Integer owner_id;

    @Override
    public String toString() {
        return new ToStringCreator(this).append("id", this.getId())
                .append("petname", this.getPetName())
                .append("birth_date", this.getBirthDate())
                .append("type_id", this.getTypeId())
                .append("owner_id", this.getOwnerId())
                .toString();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPetName() {
        return this.name;
    }
    public void setPetName(String petname) {
        this.name = petname;
    }
    public Date getBirthDate() {
        return this.birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Integer getTypeId() {
        return this.type_id;
    }
    public void setTypeId(Integer typeid) {
        this.type_id = typeid;
    }
    public Integer getOwnerId() {
        return this.owner_id;
    }
    public void setOwnerId(Integer owner_id) {
        this.owner_id = owner_id;
    }

}
