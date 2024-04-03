package git.com.HokeRoadToHell.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
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

    //vypiše list všetkých persons
    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAlllist() {
        return ResponseEntity.ok(service.getAll());
    }
}