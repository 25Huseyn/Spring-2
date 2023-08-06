package az.atlacademy.spring2.service;

import az.atlacademy.spring2.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements IUsersService {
    @Override
    public User getUserById(int id) {
        var dumyDB = List.of(
                new User("Huseyn", "Najafov", 18, "Lahij"),
                new User("Eli", "Najafov", 18, "Lahij"));
        return id == 1 ? dumyDB.get(0) : dumyDB.get(1);
    }
}
