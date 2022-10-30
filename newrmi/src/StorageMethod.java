package src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StorageMethod extends Remote {

    String GetData() throws RemoteException;
}