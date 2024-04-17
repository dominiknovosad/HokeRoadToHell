package git.com.HokeRoadToHell.clinic;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RestController
@OpenAPIDefinition
@RequestMapping("/clinic")
public class ClinicController {

    ClinicService service;

    @Autowired
    public ClinicController(ClinicService service) {
        this.service = service;
    }

    //vypiše person podľa id
    @GetMapping("/{id}")
    public ResponseEntity<Clinic> getClinic(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getClinicById(id));
    }
    @ModelAttribute("clinic")
    public Object findClinic(@PathVariable(name = "id", required = false) Integer id) {
        return id == null ? new Clinic() : this.getClinic(id);
    }
    //vypiše list všetkých persons
    @GetMapping("/all")
    public ResponseEntity<List<Clinic>> getAlllist() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/save/")
    public  ResponseEntity<Clinic> saveClinic(@RequestBody Clinic clinic) {
        return  ResponseEntity.ok(service.createClinic(clinic));
    }
}