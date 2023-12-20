package org.accolite;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {
    String fname;
    String email;

    public PersonPk() {
    }

    public PersonPk(String fname, String email) {
        this.fname = fname;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonPk{" +
                "fname='" + fname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
