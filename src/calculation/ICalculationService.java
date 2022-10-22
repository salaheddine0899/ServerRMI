package calculation;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculationService extends Remote {

    int sum(int a,int b) throws RemoteException;
    int subtraction(int a, int b) throws RemoteException;
    int multiplication(int a,int b) throws RemoteException;
    double division(int a,int b) throws RemoteException;
}
