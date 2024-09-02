import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(true);
        student.setName("Raul");

        Teacher teacher = new Teacher();
        teacher.setName("Vlad");
//        System.out.println(teacher.getMembership());
//        student.setMembership("Gold");
//        System.out.println(student.getVerified());
//        System.out.println(student.getMembership());

        ArrayList<User> users = new ArrayList<User>();
        users.add(student);
        users.add(teacher);
        users.add(new Student("Raul"));
        users.add(new Teacher("Vlad"));
        users.add(new Student("Mondek"));

        for(User u : users) {
            u.verify();
        }

      //  User u = new User();
      //  u.setName("Caleb");


      /*  ArrayList<User> users = new ArrayList<>();
        users.add(new User("Raul"));
        users.add(new User("Vlad"));
        users.add(new User("Mondek"));

        for(int i = 0 ; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
        for(User u : users) {
            System.out.println(u.getName());
        } */

        //  u.setName("Raul");
//        //  u.setMembership(User.Membership.Gold);
//        User u2 = new User("Raul" , "Silver");
//      //  User u2 = new User("Raul" , "Bronze");
//
//         System.out.println(u.equals(u2));



    }
}