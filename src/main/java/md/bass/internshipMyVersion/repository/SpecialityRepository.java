package md.bass.internshipMyVersion.repository;

import md.bass.internshipMyVersion.entities.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Specialty ,Integer> {
}
