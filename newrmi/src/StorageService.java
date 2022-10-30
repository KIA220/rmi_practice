package src;

import java.sql.SQLException;

public class StorageService {
    public String output() {
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
