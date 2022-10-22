package inter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterServiceImpl extends UnicastRemoteObject implements InterService {
    protected InterServiceImpl() throws RemoteException {
    }

    @Override
    public int addDigit(int n) throws RemoteException {
        if(n>1000 || n<0){
            throw new RuntimeException("cannot calculate digits of this number");
        }
        String numberString=String.valueOf(n);
        int sum=0;
        for(int i=0;i<numberString.length();i++)
            sum+=(int)(numberString.charAt(i)-'0');
        return sum;
    }

    @Override
    public int counter(char c, String str) throws RemoteException {
        int counter=0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==c)
                counter++;
        return counter;
    }
}
