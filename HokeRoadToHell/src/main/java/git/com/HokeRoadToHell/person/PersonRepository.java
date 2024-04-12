package git.com.HokeRoadToHell.person;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    public List<Person> findAllByFirstname(String firstName);
    public List<Person> findAllByLastname(String lastName);
}
