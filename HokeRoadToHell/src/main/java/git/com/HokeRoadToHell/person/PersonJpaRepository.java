package git.com.HokeRoadToHell.person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PersonJpaRepository extends JpaRepository<Person, Integer> {

    // Metoda findAll() získává všechny vlastníky z databáze.
    @Query("SELECT person FROM Person person")
    @Transactional(readOnly = true)
    Page<Person> findAll(Pageable pageable);
}
