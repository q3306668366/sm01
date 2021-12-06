package edu.soft2.service.impl;

import edu.soft2.dao.UserDao;
import edu.soft2.pojo.User;
import edu.soft2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    @Qualifier("userDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int delUser(User user) {
        return userDao.delUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int queryUser(User user) {
        return userDao.queryUser(user);
    }
}
