package pojo;

public class UserTest {
	private int _id;
	private String _username;
	private String _password;
	
	public UserTest() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public UserTest(int _id, String _username, String _password) {
		super();
		this._id = _id;
		this._username = _username;
		this._password = _password;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_username() {
		return _username;
	}
	public void set_username(String _username) {
		this._username = _username;
	}
	public String get_password() {
		return _password;
	}
	public void set_password(String _password) {
		this._password = _password;
	}
	@Override
	public String toString() {
		return "UserTest [_id=" + _id + ", _username=" + _username + ", _password=" + _password + "]";
	}
	
	 
}
