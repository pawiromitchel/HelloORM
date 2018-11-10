package sr.unasat.orm.hello.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @Column
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
