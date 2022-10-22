package inter;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            InterServiceImpl is= new InterServiceImpl();
            Naming.rebind("rmi://localhost:1099/is",is);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
