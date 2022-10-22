package calculation;

import calculation.CalculationServiceImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CalculationServiceImpl calculationService=new CalculationServiceImpl();
            Naming.rebind("rmi://localhost:1099/calculationService",calculationService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
