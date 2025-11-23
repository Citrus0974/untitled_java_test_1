package edu.khityaev.office;

import edu.khityaev.exception.ClosedAlreadyException;
import edu.khityaev.exception.LostConnectionException;

import java.util.Random;

public class RemoteConnection {
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
        if (!open) throw new ClosedAlreadyException();
        Random rnd = new Random();
        if(rnd.nextBoolean()) throw new LostConnectionException();
        return "test connection";
    }
}
