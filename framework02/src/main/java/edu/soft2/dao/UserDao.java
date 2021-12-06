package edu.soft2.dao;

import edu.soft2.pojo.User;

public interface UserDao {
    /**
     * 增加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    public int delUser(User user);

    /**
     * 修改用户
     */
    public int updateUser(User user);

    /**
     * 查询用户
     */
    public int queryUser(User user);
}

