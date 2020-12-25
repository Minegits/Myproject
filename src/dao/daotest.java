package dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.User;

public class daotest {
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
	public void test() throws Exception {
		UserDao userdao=new UserDaolmpl(Factory);
		User user=userdao.findUserById(2);
		System.out.println(user);
	}

}
