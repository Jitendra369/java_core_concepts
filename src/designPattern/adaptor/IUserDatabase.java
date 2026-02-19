package designPattern.adaptor;

import java.util.List;

// What our app expects from any database
public interface IUserDatabase {
    List<User> getListOfUser();
    User getUser(Integer id);
    User saveUser(User user);
}
