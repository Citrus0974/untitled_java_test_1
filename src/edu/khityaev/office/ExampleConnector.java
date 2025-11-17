package edu.khityaev.office;

import edu.khityaev.LostConnectionException;

import java.util.Random;

public class ExampleConnector{
    public void register(){
        if(new Random().nextBoolean()) throw new RuntimeException();
        System.out.println("register connection");
    }
    public void unregister(){
        System.out.println("unregister connection");
    }
    public void makeConnection(RemoteConnection conn) throws LostConnectionException {
        register();
        conn.requestConnectionData();
        unregister();
    }
}

