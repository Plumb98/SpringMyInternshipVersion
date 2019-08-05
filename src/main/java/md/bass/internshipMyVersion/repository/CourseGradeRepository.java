package md.bass.internshipMyVersion.repository;

import md.bass.internshipMyVersion.entities.CourseGrade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGradeRepository extends CrudRepository<CourseGrade , Integer> {
}
