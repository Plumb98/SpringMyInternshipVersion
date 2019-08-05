package md.bass.internshipMyVersion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "subjectName")
    private String subjectName;

    @Column(name = "durationInMinutes")
    private Integer durationInMinutes;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getSubjectName() { return subjectName; }

    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public Integer getDurationInMinutes() { return durationInMinutes; }

    public void setDurationInMinutes(Integer durationInMinutes) { this.durationInMinutes = durationInMinutes; }
}
