package md.bass.internshipMyVersion.repository;

import md.bass.internshipMyVersion.entities.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,Integer> {
}
