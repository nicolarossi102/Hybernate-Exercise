package co.develhope.HybernateExercise.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calsses_id")
    private Classes classes;

    public Enrollment(long enrollmentId, Student student, Classes classes) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.classes = classes;
    }

    public Enrollment() {
    }
}
