package com.example.ednevnik.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long Id;
    private String ime;
    private String prezime;
    public Student(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Student(Long id, String ime, String prezime) {
        Id = id;
        this.ime = ime;
        this.prezime = prezime;
    }
}
