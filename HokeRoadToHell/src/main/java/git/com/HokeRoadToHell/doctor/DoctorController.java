package git.com.HokeRoadToHell.doctor;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RestController
@OpenAPIDefinition
@RequestMapping("/doctor")
public class DoctorController {

    DoctorService service;

    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    //vypiše person podľa id
    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getDoctorById(id));
    }
    @ModelAttribute("doctor")
    public Object findperson(@PathVariable(name = "id", required = false) Integer id) {
        return id == null ? new Doctor() : this.getDoctor(id);
    }
    //vypiše list všetkých persons
    @GetMapping("/all")
    public ResponseEntity<List<Doctor>> getAlllist() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/surname/{surname}")
    public ResponseEntity<List<Doctor>> getAllBySurname(@PathVariable("surname") String surname) {
        return ResponseEntity.ok(service.findBySurname(surname));
    }
    @PostMapping("/save/")
    public  ResponseEntity<Doctor> savePerson(@RequestBody Doctor doctor) {
        return  ResponseEntity.ok(service.createPerson(doctor));
    }
}