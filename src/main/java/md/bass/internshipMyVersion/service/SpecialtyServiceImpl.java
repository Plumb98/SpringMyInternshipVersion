package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.Specialty;
import md.bass.internshipMyVersion.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {
    @Autowired
    SpecialityRepository specialityRepository;

    @Override
    public Iterable<Specialty> findAllSpecialty() {
        return specialityRepository.findAll();
    }

    @Override
    public Optional<Specialty> findCertainSpecialty(Integer id) {
        Optional<Specialty> certainSpecialty = specialityRepository.findById(id);
        return  certainSpecialty;
    }

    @Override
    public void saveSpecialty(Specialty specialty) {
        specialityRepository.save(specialty);
    }

    @Override
    public void deleteSpecialty(Integer id) {
        specialityRepository.deleteById(id);
    }

    @Override
    public void updateSpecialty(Specialty newSpecialty, Integer id) {
        Optional<Specialty> oldSpecialty = specialityRepository.findById(id);
        oldSpecialty.get().setSpecialtyName(newSpecialty.getSpecialtyName());
        oldSpecialty.get().setYears(newSpecialty.getYears());
        specialityRepository.save(oldSpecialty.get());
    }
}
