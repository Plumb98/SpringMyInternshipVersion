package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.CourseGrade;
import md.bass.internshipMyVersion.repository.CourseGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseGradeServiceImpl implements CourseGradeService {
    @Autowired
    CourseGradeRepository courseGradeRepository;

    @Override
    public void updateUser(CourseGrade courseGrade) {
        Optional<CourseGrade> oldCourseGrade = courseGradeRepository.findById( courseGrade.getId());
    }

    @Override
    public Iterable<CourseGrade> findCourseGrade() {
        return courseGradeRepository.findAll();
    }

    @Override
    public void deleteCourseGrade(Integer id) {
        courseGradeRepository.deleteById(id);
    }

    @Override
    public void saveCourseGrade(CourseGrade courseGrade) {
        courseGradeRepository.save(courseGrade);
    }
}
