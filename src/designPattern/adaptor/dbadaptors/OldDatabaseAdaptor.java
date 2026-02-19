package designPattern.adaptor.dbadaptors;

import designPattern.adaptor.User;
import designPattern.adaptor.IUserDatabase;
import designPattern.adaptor.database.OldDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OldDatabaseAdaptor implements IUserDatabase {

    private OldDatabase oldDatabase;

    public OldDatabaseAdaptor(OldDatabase oldDatabase) {
        this.oldDatabase = oldDatabase;
    }

    @Override
    public List<User> getListOfUser() {
        Map<Integer, String> allUserMap = oldDatabase.fetchAllRecord();
        List<User> users = new ArrayList<>();
        if (!allUserMap.isEmpty()){
            for (Map.Entry<Integer, String> entry : allUserMap.entrySet()) {
                String[] parts = entry.getValue().split(",");
                users.add(new User(entry.getKey(), parts[0], parts[1]));
            }
        }
        return users;
    }

    @Override
    public User getUser(Integer id) {
        String userString = oldDatabase.fetchRecord(id);
        return new User( id ,userString.split(",")[0], userString.split(",")[1]);
    }

    @Override
    public User saveUser(User user) {
        String savedUser = oldDatabase.insertRecord(user.getId(), user.getName() + user.getEmial());
        return user;
    }
}
