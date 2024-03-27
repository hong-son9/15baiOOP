package b7;

import java.util.*;

public class ManagerPerson {
    private List<Person> persons;
    public ManagerPerson(){
        this.persons = new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean delete(String id){
        Person person = this.persons.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        if(person == null){
            return false;
        }else{
            return true;
        }
    }

    public double getSalary(String id) {
        Person person = this.persons.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getSalary() + person.getBonus() - person.getPenaty();
    }
}
