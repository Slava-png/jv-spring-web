package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User get(Long id);

    void delete(Long id);

    User update(User user);
}
