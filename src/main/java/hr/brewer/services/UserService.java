package hr.brewer.services;

import hr.brewer.models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
