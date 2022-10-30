package src;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class RemoteServer implements StorageMethod {

    @Override
    public String GetData() throws RemoteException {
        try {
        DBReader DBReader = new DBReader();
        String result = DBReader.check();
        return result;
        } catch (
            SQLException e) {
            e.printStackTrace();
            return e.toString();
        }
    }

}