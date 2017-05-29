package pl.sdacademy.controller;

import pl.sdacademy.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 29.05.2017.
 */
public class PersonDAO {

    private static List<Person> workerList = new ArrayList();

    public static List<Person> getWorkerList() {
        return workerList;
    }

    public void addWorker(Person person) {

        workerList.add(person);
    }

    public void clear() {
        workerList = new ArrayList();
    }
}
