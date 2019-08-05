package md.bass.internshipMyVersion.controller;

import md.bass.internshipMyVersion.entities.CourseGrade;
import md.bass.internshipMyVersion.service.CourseGradeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseGradeController {
    @Autowired
    CourseGradeServiceImpl courseGradeService;

    @RequestMapping(value = "/courseGrade",method = RequestMethod.GET)
    public Iterable<CourseGrade> getCourseGrade(){ return courseGradeService.findCourseGrade();}

    @RequestMapping(value = "/courseGrade" ,method = RequestMethod.POST)
    public @ResponseBody void saveCourseGrade(@RequestBody CourseGrade courseGrade){ courseGradeService.saveCourseGrade(courseGrade); }

    @RequestMapping(value = "/courseGrade{id}", method = RequestMethod.DELETE)
    public void deleteCourseGrade(@PathVariable Integer id){ courseGradeService.deleteCourseGrade(id); }

    @RequestMapping(value = "/courseGrade" ,method = RequestMethod.PUT)
    public @ResponseBody void updateCourseGrade(@RequestBody CourseGrade courseGrade){ courseGradeService.updateUser(courseGrade); }


}
