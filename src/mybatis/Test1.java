package mybatis;

import java.io.IOException;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;

public class Test1 {

//	@Test
//	public void test() {
//		Connection connection = JDBCtest.getConnection();
//		String sql="select * from user ";
//	    PreparedStatement pst=null;
//		try {
//			pst = connection.prepareStatement(sql);
//			ResultSet rs= pst.executeQuery();
//			while(rs.next()) {
//			int id=rs.getInt("id");
//			String name=rs.getString("name");
//			String pasd=rs.getString("password");
//			System.out.println("id:"+id+"\t用户名："+name+"\t密码："+pasd);
//			}
//			
//		} catch (SQLException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		
//	}
	@Test
	public void test1() throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		
		SqlSession openSession = build.openSession();
		
		Object selectOne = openSession.selectOne("user.findUserById",2);
		
		System.out.println(selectOne);
		openSession.close();
		
	}
	@Test
	public void test2() throws IOException {
		
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		
		SqlSession openSession = build.openSession();
		
		 List<User> users = openSession.selectList("user.getAlluser");
		for(User userss :users) {
			System.out.println(userss);
		}
		openSession.close();
	}
	
	@Test
	public void test3() throws IOException {
         InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		
		SqlSession openSession = build.openSession();
		 List<User> user1 = openSession.selectList("user.chaxun","lisi");
		for(User user2 :user1) {
			System.out.println(user2);
		}
		openSession.close();
	}
	
	@Test
	public void test4() throws IOException {
		 InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			
		 SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		 
		 SqlSession openSession = build.openSession();
		 
		 openSession.delete("user.deleteuser", 1);
		 
		 openSession.commit();
		 
		 openSession.close();
	}

}
