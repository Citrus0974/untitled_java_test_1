package edu.khityaev.structure;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class DataBase {
    private List<String> storage = new ArrayList<>();
    private Map<Class, Function> converters = new HashMap<>();
    private int maxConnections;
    private int amountConnections;

    public DataBase(int maxConnections){
        storage=List.of("1234", "sdfi", "123456", "3456", "qwerty", "vbcjd", "0986", "4g4g4", "dfg", " dsas");

        this.maxConnections = maxConnections;
    }

    public DBConnection createConnection(){
        if(amountConnections >= maxConnections){
            return null;
        } else return new DBConnection();
    }

    public class DBConnection {
        private DBConnection() {
            amountConnections+=1;
        }

        public <T> void putConverter(Class<T> cls, Function<String, T> fun) {
            converters.put(cls, fun);
        }

        public <T> T get (Class cls, int index){
            if(index>storage.size()) return null;
            return (T) converters.get(cls).apply(storage.get(index));
        }

        public void putValue(String value){
            storage.add(value);
        }
    }
}
