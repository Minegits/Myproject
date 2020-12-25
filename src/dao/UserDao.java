package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	//增加操作
    public int insert(User users) throws Exception;
    
    //删除操作
    public int deleteByid(int id) throws Exception;
    
    //修改操作
    public int updata(User users) throws Exception;
    
    //查询单个用户
    public User findUserById(int id) throws Exception;
    
    //查询所有用户
    public List<User> findUserByUsername(String name) throws Exception;
}
