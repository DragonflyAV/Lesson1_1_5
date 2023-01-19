package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao daoHIB = new UserDaoHibernateImpl();

    public void createUsersTable() {
        daoHIB.createUsersTable();
    }

    public void dropUsersTable() {
        daoHIB.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        daoHIB.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        daoHIB.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return daoHIB.getAllUsers();
    }

    public void cleanUsersTable() {
        daoHIB.cleanUsersTable();
    }
}
