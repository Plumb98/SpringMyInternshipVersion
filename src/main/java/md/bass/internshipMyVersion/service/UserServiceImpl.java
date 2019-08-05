package md.bass.internshipMyVersion.service;

import md.bass.internshipMyVersion.entities.User;
import md.bass.internshipMyVersion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public void updateUser(User newUser , Integer id) {
        User oldUser = userRepository.findById(id).get();
        oldUser.setFirstName(newUser.getFirstName());
        oldUser.setLastName(newUser.getLastName());
        oldUser.setAge(newUser.getAge());
        userRepository.save(oldUser);

    }

    @Override
    public Iterable<User> findUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
