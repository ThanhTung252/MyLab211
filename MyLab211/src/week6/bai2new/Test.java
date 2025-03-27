/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.bai2new;

import java.util.ArrayList;

/**
 *
 * @author Dang Thanh Tung
 */
public class Test {

    public static void main(String[] args) {
        WorkerManagement workerManagement = new WorkerManagement();

        ArrayList<Salary> sh1 = new ArrayList<>();
        sh1.add(new Salary(200000, "begin", java.time.LocalDate.now().toString()));
        Worker w1 = new Worker("w1", "Ha", 25, sh1);
        workerManagement.addWorker(w1);

        ArrayList<Salary> sh2 = new ArrayList<>();
        sh1.add(new Salary(200000, "begin", java.time.LocalDate.now().toString()));
        Worker w2 = new Worker("w2", "Hung", 25, sh2);
        workerManagement.addWorker(w2);
        
        workerManagement.changeUpSalary("w1", 400000);
        
        workerManagement.getInformationSalary();

    }

}
