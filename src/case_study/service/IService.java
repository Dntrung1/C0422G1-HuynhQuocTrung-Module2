package case_study.service;

import case_study.model.Vehicle;

public interface IService {
    void display();
    void add();
    boolean remove(int controlNumber);
    Vehicle findByNumber(int number);
//    Vehicle searchControll(int number);
}
