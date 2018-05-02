package hr.brewer.services;

import hr.brewer.models.User;

public interface UserService {

    void save(User user);

    Iterable<User> getAllUser();

}
