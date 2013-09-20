
package kata2;

import java.util.Date;

public class Kata2 {

  
    public static void main(String[] args) {
        Student student = new Student("Jose", new Date(113, 9, 14));
        System.out.println(student.getAge());
    }
}
