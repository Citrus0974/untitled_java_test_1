package edu.khityaev.office;

import edu.khityaev.ClosedAlreadyException;
import edu.khityaev.LostConnectionException;

import java.util.Random;
import java.util.random.RandomGenerator;

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
        if (!open) throw new LostConnectionException();
        Random rnd = new Random();
        if(rnd.nextBoolean()) throw new ClosedAlreadyException();
        return "test connection";
    }
}
