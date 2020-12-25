package mapper;

import java.util.HashMap;
import java.util.List;

import pojo.User;
import pojo.UserTest;

public interface UserMapper {
	//Ôö¼Ó²Ù×÷
    public int insertuser(User users) throws Exception;
    public List<HashMap<?,?>> resultmap() throws Exception ;
    public User selectuserbyid(int id) throws Exception;
    public List<UserTest> selectuserbyresultmap() throws Exception ;
    public List<User> selectuserbywhere(List list) throws Exception ;
}
