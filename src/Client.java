import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String arg[]){
        try {
            ToolStudent toolStudent = (ToolStudent) Naming.lookup("rmi://localhost:1410/studentTool");

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.print("Please enter student number, type -1 to exit: ");

                // Gets input from user
                int number = scan.nextInt();

                if (number == -1) {
                    // Closes stream, exit application
                    System.out.println("Application is closed.");
                    break;
                } else {
                    Student student = toolStudent.findStudent(number);
                    System.out.println("Result: " + (student == null ? "Student not found" : student));
                }
            }
        } catch (NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
