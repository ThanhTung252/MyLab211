/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO LEGION
 */
public class ManagerWorker {
    private List<Worker> workers = new ArrayList<>();

    public boolean addWorker(Worker wr){
        for(Worker w: workers){
            if(w.getCode().equals(wr.getCode()) || wr.getCode().equals(" ")){
                System.out.println("Code already exist");
                return false;
            }
            if(wr.getAge() <=18 && wr.getAge()>= 50){
                System.out.println("Error age");
                return false;
            }
            if(wr.getSalary() <= 0){
                System.out.println("Error salary");
                return false;
            }
        }
        workers.add(wr);
        System.out.println("Add success");
        return true;
    }
    
    public boolean increaseSalary(String code, double upSalary){
        for(Worker w: workers){
            if(w.getCode().equals(code) && upSalary > w.getSalary()){
               w.setSalary(upSalary);
               w.setStatus("up");
               return true;
            }
        }
        return false;
    }
    
    public boolean decreaseSalary(String code, double deSalary){
               for(Worker w: workers){
            if(w.getCode().equals(code) && deSalary < w.getSalary()){
               w.setSalary(deSalary);
               w.setStatus("down");
               return true;
            }
        }
        return false; 
    }
    public void showWorkers(){
        for(Worker w : workers){
            System.out.println(w.toString());
        }
    }
    
    
}