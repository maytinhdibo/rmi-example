import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String arg[]){
        try {
            ToolStudent toolStudent = (ToolStudent) Naming.lookup("rmi://localhost:1410/studentTool");
            System.out.println(toolStudent.findStudent(17020076));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
