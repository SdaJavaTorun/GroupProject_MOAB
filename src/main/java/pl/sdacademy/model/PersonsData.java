package pl.sdacademy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 27.05.2017.
 */
public class PersonsData {

    private String name;
    private String lastName;
    private int age;
    List<PersonsData> workerList = new ArrayList();


    public PersonsData(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
