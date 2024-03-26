package b6;

import java.util.*;
import java.util.stream.Collectors;

public class School {
    List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }
    public void add(Student student){
        this.students.add(student);
    }
    public List<Student> show(){
        return this.students.stream().filter(s -> s.getAge() == 20).collect(Collectors.toList());
    }
    public long countStudent23YearOldInDN() {
        return this.students.stream().filter(student -> student.getAge() == 23 && student.getAddress().equals("DN")).count();
    }
}
