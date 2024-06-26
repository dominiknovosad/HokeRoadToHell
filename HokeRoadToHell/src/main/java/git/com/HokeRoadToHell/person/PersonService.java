package git.com.HokeRoadToHell.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    PersonRepository repository;

    // doplnovanie a prepisovanie medzi sebou
    @Autowired
    public void PersonRepository(PersonRepository personRepository) {
        this.repository = personRepository;
    }
    // service pre vypisanie person podľa ID
    public Person getPersonById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    //service pre vypísanie všeho
    public List<Person> getAll() {
        return repository.findAll();
    }
    public List<Person> findByFirstName(String firstName) {
        return repository.findAllByFirstname(firstName);
    }
    public List<Person> findByLastName(String lastName) {
        return repository.findAllByLastname(lastName);
    }
    public Person createPerson(Person person) {
        return repository.save(person);
    }
}
