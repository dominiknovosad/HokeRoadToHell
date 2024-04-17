package git.com.HokeRoadToHell.clinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    ClinicRepository repository;

    // doplnovanie a prepisovanie medzi sebou
    @Autowired
    public void ClinicRepository(ClinicRepository clinicRepository) {
        this.repository = clinicRepository;
    }
    // service pre vypisanie person podľa ID
    public Clinic getClinicById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    //service pre vypísanie všeho
    public List<Clinic> getAll() {
        return repository.findAll();
    }
    public Clinic createClinic(Clinic clinic) {
        return repository.save(clinic);
    }
}
