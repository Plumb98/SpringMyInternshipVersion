package md.bass.internshipMyVersion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private  String lastName;
    @Column(name = "username")
    private  String username;
    @Column(name = "age")
    private Integer age;

    public Integer getId() { return Id; }

    public void setId(Integer id) { Id = id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }
}
