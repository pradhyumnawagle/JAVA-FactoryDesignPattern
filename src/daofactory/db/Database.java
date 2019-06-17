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
public abstract class Database {
    public abstract void openConnection();
    public abstract boolean execute(String sql);
    public abstract void closeConnection();
}
