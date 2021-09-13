package web.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(long id);
    void editUser(User user);
    User getUserById(Long id);
    List<User> listUsers();


    @Transactional
    User findUserByLogin(String login);
}