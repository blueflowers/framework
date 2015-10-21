package com.glove.entity;

import com.glove.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Created by Frank on 2015/10/21.
 */
@Entity
@Table(name ="student")
public class Student extends BaseEntity{
    @Column
    private String name;
    @Column
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
