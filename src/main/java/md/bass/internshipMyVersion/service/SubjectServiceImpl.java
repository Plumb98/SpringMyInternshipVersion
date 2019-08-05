package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.Subject;
import md.bass.internshipMyVersion.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.BufferPoolMXBean;
import java.util.Optional;
@Service
public class SubjectServiceImpl implements SubjectService {
   @Autowired
    SubjectRepository subjectRepository;

@Override
    public void updateSubject(Subject newSubject , Integer id){
        Subject oldSubject = subjectRepository.findById(id).get();
        oldSubject.setSubjectName(newSubject.getSubjectName());
        oldSubject.setDurationInMinutes(newSubject.getDurationInMinutes());

    }
    @Override
    public Iterable<Subject> findSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public void saveSubject(Subject subject) {
        subjectRepository.save(subject);
    }
}


//@Override
//    public Optional<Subject> updateSubject(Subject newSubject , Integer id) {
//        return subjectRepository.findById(id).map(subject ->{
//            newSubject.setSubjectName(newSubject.getSubjectName());
//            return subjectRepository.save(subject);
//        });
//    }