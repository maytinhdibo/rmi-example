import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ToolStudent extends Remote {
    public Student findStudent(int id) throws RemoteException;
}
