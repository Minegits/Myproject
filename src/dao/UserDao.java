package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	//���Ӳ���
    public int insert(User users) throws Exception;
    
    //ɾ������
    public int deleteByid(int id) throws Exception;
    
    //�޸Ĳ���
    public int updata(User users) throws Exception;
    
    //��ѯ�����û�
    public User findUserById(int id) throws Exception;
    
    //��ѯ�����û�
    public List<User> findUserByUsername(String name) throws Exception;
}
