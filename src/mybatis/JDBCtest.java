package mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtest {
	//注册驱动
	       static {
    	   try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
       }
    //获取连接
	       public static Connection getConnection() {
	    	   Connection connetion=null;
	    	   String url="jdbc:mysql://localhost:3306/user";
	    	   String name="root";
	    	   String password="123456";
	    	   try {
	    		   connetion=DriverManager.getConnection(url,name,password);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	    	   return connetion;
	       }
}
