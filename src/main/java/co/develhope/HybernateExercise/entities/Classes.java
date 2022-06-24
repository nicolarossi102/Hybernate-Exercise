package co.develhope.HybernateExercise.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ClassId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes", fetch = FetchType.LAZY)
    private List<Enrollment> enrollments;


    public Classes() {
    }

    public Classes(long classId, String title, String description, List<Enrollment> enrollments) {
        this.ClassId = classId;
        this.title = title;
        this.description = description;
        this.enrollments = enrollments;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public long getClassId() {
        return ClassId;
    }

    public void setClassId(long classId) {
        ClassId = classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
