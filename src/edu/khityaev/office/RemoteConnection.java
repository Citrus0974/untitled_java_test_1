package edu.khityaev.office;

import edu.khityaev.exception.ClosedAlreadyException;
import edu.khityaev.exception.LostConnectionException;

import java.util.Random;

public class RemoteConnection{
    private boolean open = true;
    private String address;

    public RemoteConnection(String address) {
        this.address = address;
    }

    public void closeConnection(){
        this.open = false;
    }
    public boolean isOpen(){
        return this.open;
    }

    public String requestConnectionData() throws LostConnectionException {
//        if (!open) throw new ClosedAlreadyException();
        register();
        Random rnd = new Random();
        if(rnd.nextBoolean()) throw new LostConnectionException();
        unregister();
        return "test connection";
    }

    public void register() throws LostConnectionException {
        if(new Random().nextBoolean()) throw new LostConnectionException();
        System.out.println("register connection");
    }
    public void unregister(){
        System.out.println("unregister connection");
    }
}
