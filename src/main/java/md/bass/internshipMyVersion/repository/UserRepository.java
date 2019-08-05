package md.bass.internshipMyVersion.repository;

import md.bass.internshipMyVersion.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
