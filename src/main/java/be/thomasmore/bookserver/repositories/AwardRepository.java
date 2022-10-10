package be.thomasmore.bookserver.repositories;

import be.thomasmore.bookserver.model.Award;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface AwardRepository extends CrudRepository<Award, Integer> {
    @NonNull
    List<Award> findAll();
}
