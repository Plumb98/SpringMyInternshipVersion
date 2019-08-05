package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.Specialty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SpecialtyService {
    Iterable<Specialty> findAllSpecialty();
    Optional<Specialty> findCertainSpecialty(Integer id);
    void  saveSpecialty (Specialty specialty);
    void deleteSpecialty (Integer id);
    void updateSpecialty (Specialty newSpecialty, Integer id);
}
