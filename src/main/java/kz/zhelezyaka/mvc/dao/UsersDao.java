package kz.zhelezyaka.mvc.dao;


import kz.zhelezyaka.mvc.model.User;

import java.util.List;

public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
