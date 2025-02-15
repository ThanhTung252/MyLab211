/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import week4.ManageStudents.Student;

/**
 *
 * @author Dang Thanh Tung
 */
public class StudentManagement {

    public ArrayList<Student> studentsList = new ArrayList<>();

    private boolean checkStudents(Student st) {
        // kiểm tra sinh viết đã có trong list chưa và kiểm tra, nếu chưa có thì trả về true, còn nếu có thì trả về false.
        for (Student student : studentsList) {
            if (student.getId().equals(st.getId())) {
                if (student.getSemester().equals(st.getSemester())) {
                    if (student.getCourseName().equals(st.getCourseName())) {
                        return false;
                    }
                }

            }

        }
        return true;
    }

    public boolean addStudents(Student st) {
        Scanner sc = new Scanner(System.in);
        if(studentsList.size() >= 3){
            System.out.println("Do you want to add ? (yes/no)");
            String answer = sc.nextLine().trim().toLowerCase();
            if(!answer.equals("yes")){
                System.out.println("Back to main Screen");
                return false;
            }
        }
        if (checkStudents(st)) {
            studentsList.add(st);
            return true;
        }
        System.out.println("Students already exist in list");
        return false;
    }

    public void showStudents() {
        for (Student st : studentsList) {
            System.out.println(st.toString());
        }
    }

    public List<Student> findStudents(String name) {
        List<Student> ListST = new ArrayList<>();
        for (Student st : studentsList) {
            if (st.getName().toLowerCase().contains(name.toLowerCase())) {
                ListST.add(st);
            }
        }
        return ListST;
    }

    public int deleteStudent(String id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(id)) {
                studentsList.remove(i);
                return 1;
            }
        }

        return 0;
    }

    public int updateStudents(Student st) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getId().equals(st.getId())) {
                studentsList.set(i, st);
                return 1;
            }

        }

        return 0;
    }

    public void sortStudents() {
        Collections.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });

    }
       public void reportStudent(){
        Map<String, Integer> report = new HashMap<>();
        for(Student st : studentsList){
            String key = st.getId() + "|" + st.getName() + st.getCourseName();
            report.put(key, report.getOrDefault(key, 0) +1);
            
        }
        for(Map.Entry<String, Integer> entry : report.entrySet()){
            System.out.println(entry.getKey()+ "|" + entry.getValue());
        }
    }

}