package md.bass.internshipMyVersion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Specialties")
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String specialtyName;

    @Column(name = "years")
    private Integer years;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getSpecialtyName() { return specialtyName; }
    public void setSpecialtyName(String specialtyName) { this.specialtyName = specialtyName; }
    public Integer getYears() { return years; }
    public void setYears(Integer years) { this.years = years; }
}
