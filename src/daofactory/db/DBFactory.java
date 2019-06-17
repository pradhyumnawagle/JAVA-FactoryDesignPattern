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
public class DBFactory {
    public Database giveDatabase(String name){
        if(name.equalsIgnoreCase("mysql")){
            return new MySql();
        } else if(name.equalsIgnoreCase("mongodb")){
            return new MongoDB();
        } else if(name.equalsIgnoreCase("postgres")){
            return new PostGres();
        }
        return null;
    }
}
