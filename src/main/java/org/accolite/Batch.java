package org.accolite;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Batch")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int batchId;
    String duration;
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Student.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "batchId", referencedColumnName = "batchId")
    Set<Student> students = new HashSet<Student>();

    public Batch(int batchId, String duration, Set<Student> students) {
        this.batchId = batchId;
        this.duration = duration;
        this.students = students;
    }

    public Batch() {

    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
