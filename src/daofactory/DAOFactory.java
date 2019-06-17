/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daofactory;

import daofactory.db.DBFactory;
import daofactory.db.Database;
import daofactory.db.MongoDB;
import daofactory.db.MySql;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pradh
 */
public class DAOFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBFactory factory = new DBFactory();
        Database db = factory.giveDatabase("MongoDb");
        db.openConnection();
        db.execute("SELECT * FROM Customers JOIN Orders");
        db.closeConnection();
    }
    
}
