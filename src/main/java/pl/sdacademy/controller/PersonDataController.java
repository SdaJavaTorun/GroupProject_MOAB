package pl.sdacademy.controller;

import pl.sdacademy.model.PersonsData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 29.05.2017.
 */
public class PersonDataController {

    private static List<PersonsData> workerList = new ArrayList();

    public static List<PersonsData> showWorkerList() {
        return workerList;
    }


    public void addWorker(PersonsData personsData) {

        workerList.add(personsData);
    }


}
