package md.bass.internshipMyVersion.service;


import md.bass.internshipMyVersion.entities.CourseGrade;
import org.springframework.stereotype.Service;

@Service
public interface CourseGradeService {
    void updateUser(CourseGrade courseGrade);
    Iterable<CourseGrade> findCourseGrade();
    void deleteCourseGrade(Integer id);
    void saveCourseGrade(CourseGrade courseGrade);
}
