package git.com.HokeRoadToHell.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class PersonController {

    // Repository pro vlastníky (OwnerRepository).
    private final PersonJpaRepository persons;

    // Konstruktor třídy OwnerController, injektuje OwnerRepository pomocí Springu.
    @Autowired
    public PersonController(PersonJpaRepository Personservice) {
        this.persons = Personservice;
    }

    // Metoda setAllowedFields() nastavuje povolené a zakázané pole pro databázové vazby.
    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    // Metoda findOwner() vrací vlastníka podle ID, pokud ID není zadané, vrací nového vlastníka.
    @ModelAttribute("owner")
    public Object findPerson(@PathVariable(name = "personId", required = false) Integer personId) {
        return personId == null ? new Person() : this.persons.findById(personId);
    }

}