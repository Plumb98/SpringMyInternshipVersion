package md.bass.internshipMyVersion.controller;

import md.bass.internshipMyVersion.entities.Specialty;
import md.bass.internshipMyVersion.service.SpecialtyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SpecialtyController {
    @Autowired
    SpecialtyServiceImpl specialtyServiceImpl;

    @RequestMapping(value = "/specialty" , method = RequestMethod.GET)
     Iterable<Specialty> getAllSpecialty(){return specialtyServiceImpl.findAllSpecialty(); }

    @RequestMapping(value = "/specialty" , method = RequestMethod.POST)
    void saveSpecialty(@RequestBody Specialty specialty
    ){specialtyServiceImpl.saveSpecialty(specialty); }

    @RequestMapping(value = "/specialty/{id}" , method = RequestMethod.DELETE)
    void deleteSpecialty (@PathVariable Integer id){specialtyServiceImpl.deleteSpecialty(id);}

    @RequestMapping(value = "/specialty/{id}" , method = RequestMethod.PUT)
     void updateSpecialty (@RequestBody Specialty newSpecialty,@PathVariable Integer id){specialtyServiceImpl.updateSpecialty(newSpecialty,id);}

    @RequestMapping(value = "/specialty/{id}" , method = RequestMethod.GET)
    Optional<Specialty> getCertainSpecialty(@PathVariable Integer id){return specialtyServiceImpl.findCertainSpecialty(id);}

}
