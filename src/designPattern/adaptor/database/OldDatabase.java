package designPattern.adaptor.database;

import java.util.HashMap;
import java.util.Map;

public class OldDatabase {
    private Map<Integer , String> table = new HashMap<>();

    public OldDatabase(){
        table.put(1,"jittu, jittu@gmail.com");
        table.put(2,"vikas, vikas@gmail.com");
    }

    public Map<Integer, String> fetchAllRecord(){
        return table;
    }

    public String fetchRecord(int id ){
        return table.get(id);
    }
    public String insertRecord(int id , String record){
        return  table.putIfAbsent(id, record);
    }
}
