package git.com.HokeRoadToHell.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    PetRepository repository;
    @Autowired
    public void PetRepository(PetRepository petRepository) {
        this.repository = petRepository;
    }
    public Pet getPetById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    public List<Pet> getAll() {
        return repository.findAll();
    }
    public Pet createPet(Pet pet) {
        return repository.save(pet);
    }
}
