package javaCampG�n5�dev1.business.Abstract;

import java.util.ArrayList;

import javaCampG�n5�dev1.entities.Concretes.User;

public interface UserService {
	
	public void register(User user);
	public void login(User user);
	public ArrayList<User> GetAllUsers();
	

}
