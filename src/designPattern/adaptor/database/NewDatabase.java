package designPattern.adaptor.database;

import java.util.HashMap;
import java.util.Map;

public class NewDatabase {
    private Map<Integer, Map<String, String>> data = new HashMap<>();

    NewDatabase(){
        Map<String, String> user1 = new HashMap<>();
        user1.put("name","jitendra");
        user1.put("email","jittu@gmail.com");
        data.put(2, user1);

        Map<String, String> user2 = new HashMap<>();
        user1.put("name","vikas");
        user1.put("email","vikas@gmail.com");
        data.put(3, user2);
    }

    public Map<Integer, Map<String, String>>  findAll(){
        return data;
    }

    public Map<String, String> findUser(int id){
        Map<String, String> user = data.get(id);
        return user;
    }

    public Map<String, String> saveUser(int id , Map<String , String > userDetailsMap){
        Map<String, String> savedUser = data.put(id, userDetailsMap);
        return savedUser;
    }
}
