package org.accolite;

import jakarta.persistence.*;

@Entity
@Table(name = "Person_table")
public class Person
{
    @EmbeddedId
    private	PersonPk pk;
    private int id;
    private String age;
    @Column(name = "person_name")
    private String name;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public PersonPk getPk()
    {
        return pk;
    }
    public void setPk(PersonPk pk)
    {
        this.pk = pk;
    }
    public String getAge()
    {
        return age;
    }
    public void setAge(String age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}