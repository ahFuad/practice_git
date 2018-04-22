import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Greetings");
        System.out.println("Hi there");

        Student student = new Student();
        student.setId(2);
        student.setName("Fuad");
        String s = student.toString();
        System.out.println(s);

    }
}
