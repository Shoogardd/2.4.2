package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    void delete(long id);
    void editUser(User user);
    User getUserById(Long id);
    List<User> listUsers();
}