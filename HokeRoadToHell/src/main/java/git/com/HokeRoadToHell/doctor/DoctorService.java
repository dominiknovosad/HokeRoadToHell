package git.com.HokeRoadToHell.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    DoctorRepository repository;

    // doplnovanie a prepisovanie medzi sebou
    @Autowired
    public void DoctorRepository(DoctorRepository doctorRepository) {
        this.repository = doctorRepository;
    }
    // service pre vypisanie person podľa ID
    public Doctor getDoctorById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    //service pre vypísanie všeho
    public List<Doctor> getAll() {
        return repository.findAll();
    }
    public List<Doctor> findBySurname(String surname) {
        return repository.findAllBySurname(surname);
    }
    public Doctor createPerson(Doctor doctor) {
        return repository.save(doctor);
    }
}
