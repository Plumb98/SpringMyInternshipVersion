package md.bass.internshipMyVersion.repository;

import md.bass.internshipMyVersion.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends CrudRepository<User, Integer> {
}
