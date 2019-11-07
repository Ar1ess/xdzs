package service;

import model.User;

import java.util.List;

/**
 * @author : Ar1es
 * @date : 2019/7/30
 * @since : Java 8
 */
public interface UserService {

    List<User> findAllUser();
}
