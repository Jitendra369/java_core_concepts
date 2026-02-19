package designPattern.adaptor.dbadaptors;

import designPattern.adaptor.User;
import designPattern.adaptor.IUserDatabase;
import designPattern.adaptor.database.NewDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewDataBaseAdaptor implements IUserDatabase {

    private NewDatabase newDatabase;

    NewDataBaseAdaptor(NewDatabase newDatabase){
        this.newDatabase = newDatabase;
    }

    @Override
    public List<User> getListOfUser() {
        return List.of();
    }

    @Override
    public User getUser(Integer id) {
        Map<String, String> userMap = newDatabase.findUser(id);
        List<User> savedUsers = new ArrayList<>();
        for (Map.Entry<String, String> entry : userMap.entrySet()){
            savedUsers.add(new User(id, entry.getKey(), entry.getValue()));
        }
        return savedUsers.get(1);
    }

    @Override
    public User saveUser(User user) {
        return null;
    }
}
