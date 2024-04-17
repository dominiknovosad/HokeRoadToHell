package git.com.HokeRoadToHell.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    public List<Doctor> findAllBySurname(String lastName);

}
