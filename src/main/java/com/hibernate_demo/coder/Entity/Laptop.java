package com.hibernate_demo.coder.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int lapId;
    private String lapBrand;
    @Transient
    private String lapDescription;
    @ManyToOne()
    @JoinColumn(name = "t_id")
    private  Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public String getLapBrand() {
        return lapBrand;
    }

    public void setLapBrand(String lapBrand) {
        this.lapBrand = lapBrand;
    }

    public String getLapDescription() {
        return lapDescription;
    }

    public void setLapDescription(String lapDescription) {
        this.lapDescription = lapDescription;
    }
}
