package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.Subject;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SubjectService {
    void updateSubject(Subject newSubject , Integer id);
    Iterable<Subject> findSubject();
    void deleteSubject(Integer id);
    void saveSubject(Subject subject);

}
