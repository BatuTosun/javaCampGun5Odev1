package javaCampGün5Ödev1.business.Abstract;

import java.util.ArrayList;

import javaCampGün5Ödev1.entities.Concretes.User;

public interface UserService {
	
	public void register(User user);
	public void login(User user);
	public ArrayList<User> GetAllUsers();
	

}
