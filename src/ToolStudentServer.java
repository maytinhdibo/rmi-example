import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Optional;

public class ToolStudentServer extends UnicastRemoteObject implements ToolStudent, Serializable {


    protected ToolStudentServer() throws RemoteException {
        super();
    }

    @Override
    public Student findStudent(int id) throws RemoteException {
        // Generate fake data
        ArrayList<Student> fakeData = new ArrayList<Student>();
        fakeData.add(new Student(17020076, "Cuong Tran", "62CLC", "14/10/1999", "Nghe An"));
        fakeData.add(new Student(17020077, "Ngoc Dang", "62CLC", "14/08/1999", "Nghe An"));
        fakeData.add(new Student(17020078, "Do Phong", "62CLC", "12/01/1999", "Ha Noi"));

        //Find student

        Optional<Student> ret = fakeData.stream().filter(student -> student.getNumber() == id).findFirst();

        // Return result
        if (ret.isPresent())
            return ret.get();
        else
           return null;
    }

}
