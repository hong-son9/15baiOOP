package b7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerPerson managerTeacher = new ManagerPerson();
        while (true) {
            // show input for user choise
            // 1 to insert
            managerTeacher.add(new Person());
            // 2 to remove => input id. output boolean
            System.out.print("Enter id to remove: ");
            String id = scanner.nextLine();
            System.out.println(managerTeacher.delete(id) ? "Success" : "Fail");
            // 4 get salary => input id. output double
            System.out.print("Enter id to salary: ");
            String id1 = scanner.nextLine();
            System.out.println(managerTeacher.getSalary(id1));
            // 5 exit => return

        }
    }
}
