package calculation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculationServiceImpl extends UnicastRemoteObject implements ICalculationService {
    protected CalculationServiceImpl() throws RemoteException {
    }

    @Override
    public int sum(int a, int b) throws RemoteException{
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) throws RemoteException{
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException{
        return a*b;
    }

    @Override
    public double division(int a, int b) throws RemoteException{
        return (double)a/b;
    }
}
