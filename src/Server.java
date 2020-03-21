import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main (String arg[]){
        try {

            InetAddress host = InetAddress.getLocalHost();
            System.out.println(host.getHostAddress());

            // Load the service
            ToolStudentServer tool = new ToolStudentServer();
            String res = "rmi://localhost:1410/studentTool";
            // Register with service
            Naming.rebind(res, tool);
            System.out.println("Server is running");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
