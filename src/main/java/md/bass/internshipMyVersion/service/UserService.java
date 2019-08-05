package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void updateUser(User newUser ,Integer id);
    Iterable<User> findUser();
    void deleteUser (Integer id);
    void saveUser (User user);

}
