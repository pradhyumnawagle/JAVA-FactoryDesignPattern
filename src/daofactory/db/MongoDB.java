/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daofactory.db;

/**
 *
 * @author pradh
 */
public class MongoDB extends Database{

    @Override
    public void openConnection() {
        System.out.println("Connection to MongoDb estabilished!!");
    }

    @Override
    public boolean execute(String sql) {
        System.out.println("Execute query " + sql);
        return true;
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection with MongoDb closed!!!");
    }
    
    
}
