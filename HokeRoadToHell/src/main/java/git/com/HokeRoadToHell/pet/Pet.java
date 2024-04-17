package git.com.HokeRoadToHell.pet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.springframework.core.style.ToStringCreator;

import java.util.Date;

@Entity
@Table(name = "pets") // Název tabulky v databázi, do které bude tato entita mapována.
public class Pet  {

    @Id
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "birth_date")
    @NotNull
    private Date birth_date;

    @Column(name = "type_id")
    @NotNull
    private Integer type_id;

    @Column(name = "owner_id")
    @NotNull
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
        return this.birth_date;
    }
    public void setBirthDate(Date birth_date) {
        this.birth_date = birth_date;
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
