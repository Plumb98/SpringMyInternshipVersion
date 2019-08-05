package md.bass.internshipMyVersion.controller;

import md.bass.internshipMyVersion.entities.Subject;
import md.bass.internshipMyVersion.service.SubjectService;
import md.bass.internshipMyVersion.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class SubjectController {
    @Autowired
    SubjectServiceImpl subjectService;
    @RequestMapping(value = "/subject" ,method = RequestMethod.GET)
    Iterable<Subject> findSubject(){ return subjectService.findSubject(); }//?iterable
    @RequestMapping(value = "/subject", method = RequestMethod.POST)
    @ResponseBody void saveSubject  (@RequestBody  Subject subject){subjectService.saveSubject(subject);}
    @RequestMapping(value = "/subject/{id}", method = RequestMethod.DELETE)
    void deleteSubject(@PathVariable Integer id){subjectService.deleteSubject(id);}
    @RequestMapping(value = "/subject/{id}", method = RequestMethod.PUT)
    void updateSubject (@RequestBody Subject newSubject ,@PathVariable Integer id){subjectService.updateSubject(newSubject,id);}

}
