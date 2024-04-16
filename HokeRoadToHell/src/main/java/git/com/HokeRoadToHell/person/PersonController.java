package git.com.HokeRoadToHell.person;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RestController
@OpenAPIDefinition
@RequestMapping("/person")
public class PersonController {

    PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    //vypiše person podľa id
    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getPersonById(id));
    }
    @ModelAttribute("person")
    public Object findperson(@PathVariable(name = "id", required = false) Integer id) {
        return id == null ? new Person() : this.getPerson(id);
    }
    //vypiše list všetkých persons
    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAlllist() {
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/allbyname/{name}")
    public ResponseEntity<List<Person>> getAllByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(service.findByFirstName(name));
    }

    @GetMapping("/allbylastname/{lastname}")
    public ResponseEntity<List<Person>> getAllByLastName(@PathVariable("lastname") String lastname) {
        return ResponseEntity.ok(service.findByLastName(lastname));
    }
    @PostMapping("/save/")
    public  ResponseEntity<Person> savePerson(@RequestBody Person person) {
        return  ResponseEntity.ok(service.createPerson(person));
    }
}