package git.com.HokeRoadToHell.pet;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RestController
@OpenAPIDefinition
@RequestMapping("/pet")
public class PetController {

    PetService service;

    @Autowired
    public PetController(PetService service) {
        this.service = service;
    }

    //vypiše person podľa id
    @GetMapping("/{id}")
    public ResponseEntity<Pet> getPet(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getPetById(id));
    }
    @ModelAttribute("pet")
    public Object findpet(@PathVariable(name = "id", required = false) Integer id) {
        return id == null ? new Pet() : this.getPet(id);
    }
    //vypiše list všetkých persons
    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAlllist() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/save/")
    public  ResponseEntity<Pet> savePet(@RequestBody Pet pet) {
        return  ResponseEntity.ok(service.createPet(pet));
    }
}
