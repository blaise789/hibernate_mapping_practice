package com.hibernate_demo.coder.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity()
@Table(name = "teachers")

public class Teacher {


    //    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

//    private  String firstName
    private Names names;
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Laptop> laptop;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "teacher_students",joinColumns =@JoinColumn(name = "t_id") ,inverseJoinColumns =@JoinColumn(name = "st_id")
    )
    private List<Student> students;

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptops(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



}
