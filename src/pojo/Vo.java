package pojo;

public class Vo {
	private User user;
	private String username;
	
	
	public Vo() {
		super();
	}


	public Vo(User user, String username) {
		super();
		this.user = user;
		this.username = username;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Vo [user=" + user + ", username=" + username + "]";
	}
	
}
