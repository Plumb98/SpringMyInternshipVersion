package md.bass.internshipMyVersion.entities;

import javax.persistence.*;


@Entity
@Table(name="CourseGrades")
public class CourseGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "marks")
    private Integer marks;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getMarks() { return marks; }

    public void setMarks(Integer marks) { this.marks = marks; }
}
