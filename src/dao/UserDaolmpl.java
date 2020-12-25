package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.User;

public class UserDaolmpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory=null;
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
    //注入SqlSessionFactory
    public UserDaolmpl(SqlSessionFactory sqlSessionFactory) {
    	this.setSqlSessionFactory( sqlSessionFactory);
	}

    
	@Override
	public int insert(User users) throws Exception {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int deleteByid(int id) throws Exception {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int updata(User users) throws Exception {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public User findUserById(int id) throws Exception {
        SqlSession openSession = sqlSessionFactory.openSession();
		User user = openSession.selectOne("user.findUserById",2);
		openSession.close();
		return user;
	}

	@Override
	public List<User> findUserByUsername(String name) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

}
