package src;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

    public static final String UNIQUE_BINDING_NAME = "server.storage";

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(8622);

        StorageMethod StorageMethod = (StorageMethod) registry.lookup(UNIQUE_BINDING_NAME);

        String multiplyResult = StorageMethod.GetData();

        System.out.println(multiplyResult);
    }
}