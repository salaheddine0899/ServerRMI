package inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterService extends Remote {
    int addDigit(int n) throws RemoteException;
    int counter(char c,String str) throws RemoteException;
}
