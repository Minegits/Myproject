package mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtest {
	//ע������
	       static {
    	   try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
       }
    //��ȡ����
	       public static Connection getConnection() {
	    	   Connection connetion=null;
	    	   String url="jdbc:mysql://localhost:3306/user";
	    	   String name="root";
	    	   String password="123456";
	    	   try {
	    		   connetion=DriverManager.getConnection(url,name,password);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	    	   return connetion;
	       }
}
