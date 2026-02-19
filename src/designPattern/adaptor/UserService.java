package designPattern.adaptor;

import java.util.List;

public class UserService {
    private IUserDatabase userDatabase;

    UserService(IUserDatabase iUserDatabase){
        this.userDatabase = iUserDatabase;
    }

    List<User> showAllUsers(){
        return userDatabase.getListOfUser();
    }

    User findUser(int id ){
        return userDatabase.getUser(id);
    }

}
