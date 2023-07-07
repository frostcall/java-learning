// import java.util.Scanner;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "OK "+name+ ". It Looks like you are "+age+" years old.");

        
/*
        System.out.println("Hello, World!");
        System.out.print("\tNew Line printed.\n");
        System.out.println("Another new Line printed.");

        int newInt = 123;
        boolean newBool = true;
        float newFloat = 3.14f;
        long newLong = 1223123121123123L;
        double newDouble = 3.14;
        String newString = "Hello there!";


        System.out.println("Variables: "+newInt +" "+newBool+" "+newFloat+" "+newLong+" "+newDouble);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int newAge = age + 1;

        System.out.println("Hello "+name);
        System.out.println("Did you say you were "+newAge+" years old?");

*/
    }
}
