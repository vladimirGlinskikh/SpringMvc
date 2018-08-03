package kz.zhelezyaka.app;

import kz.zhelezyaka.mvc.dao.UsersDao;
import kz.zhelezyaka.mvc.dao.UsersDaoJdbcTemplateImpl;
import kz.zhelezyaka.mvc.model.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("zh");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fix_user_db");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);

        List<User> users = usersDao.findAll();
        System.out.println(users);
    }
}
