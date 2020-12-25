package mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.UserDao;
import dao.UserDaolmpl;
import pojo.User;
import pojo.UserTest;

public class MapperTest {
	SqlSessionFactory Factory;
    @Before
	public void setup() {
    	InputStream is=null;
    	try {
			is = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	Factory= new SqlSessionFactoryBuilder().build(is);
    }
    @Test
	public void test2() throws Exception {
    	SqlSession openSession = Factory.openSession();
    	UserMapper mapper = openSession.getMapper(UserMapper.class);
    	User selectuserbyid = mapper.selectuserbyid(3);
    	System.out.println(selectuserbyid);
    }
    
    
	@Test
	public void test4() {
		SqlSession openSession = Factory.openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		try {
			List<UserTest> usertestlist = mapper.selectuserbyresultmap();
			for(UserTest user : usertestlist) {
				System.out.println(user);
			}
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	@Test //添加
	public void test() throws Exception {
		SqlSession openSession = Factory.openSession();
		UserMapper mapper=openSession.getMapper(UserMapper.class);
		User user = new User("zhangsan" , "abc");
		int insertuser = mapper.insertuser(user);
		System.out.println("影响行："+insertuser);
	}
	@Test 
	public void test5() throws Exception {
		SqlSession openSession = Factory.openSession();
		UserMapper mapper=openSession.getMapper(UserMapper.class);
		List list = new ArrayList();
		for(int i=1;i<3;i++) {
			list.add(i);
		}
		List<User> userlist = mapper.selectuserbywhere(list);
		for(User user :userlist) {
			System.out.println(user);
		}
	}
}