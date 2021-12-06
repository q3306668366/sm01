package edu.soft2.dao.impl;

import edu.soft2.dao.UserDao;

import edu.soft2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

@Repository
public class UserDaoImpl implements UserDao {

    private User user;
    @Autowired
    @Qualifier("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 数据库增操作
     * @param user
     * @return
     */
    @Override
    public int addUser(User user) {
        if (user != null) {
            //1.获取JDBC的链接对象Connection
            //2.sql语句拼接
            String sql = "insert user(name,pwd) values("+user.getName()+","+user.getPwd()+")";
            System.out.println("add的sql语句"+sql);
            //3.PreparedStatement执行sql语句，用
            //4.获取sql执行结果executeupdate

            System.out.println("数据库add操作");
            return 1;
        }
        return 0;
    }

    /**
     * 数据库删除操作
     * @param user
     * @return
     */
    @Override
    public int delUser(User user) {
        if (user != null) {
            System.out.println("数据库del操作");
            return 1;
        }
        return 0;
    }

    /**
     * 数据库修改操作
     * @param user
     */
    @Override
    public int updateUser(User user) {
        if (user != null) {
            System.out.println("数据库修改操作");
            return 1;
        }
        return 0;
    }

    /**
     * 数据库查询操作
     * @param user
     */
    @Override
    public int queryUser(User user) {
        if (user != null) {
            System.out.println("数据库查询操作");
            return 1;
        }
        return 0;
    }
}
