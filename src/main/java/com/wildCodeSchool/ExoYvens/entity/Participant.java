package com.wildCodeSchool.ExoYvens.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Participant {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String firstName;
private String lastName;
private String gender;
private Number age;


public Participant() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}

public Number getAge() {
    return age;
}

public void setAge(Number age) {
    this.age = age;
}


}



