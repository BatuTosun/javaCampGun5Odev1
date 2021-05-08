package javaCampG�n5�dev1.business.Concrete;

import java.util.ArrayList;

import javaCampG�n5�dev1.business.Abstract.UserService;
import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.dataAccess.Abstract.UserDao;
import javaCampG�n5�dev1.entities.Concretes.User;

public class UserManager implements UserService{
	
	private ValidatorService[] validatorServices;
	private UserDao dataAccess;
	private ArrayList<User> users;

	public UserManager(ValidatorService[] validatorServices, UserDao dataAccess, ArrayList<User> users) {
		this.validatorServices = validatorServices;
		this.dataAccess = dataAccess;
		this.users = users;
	}

	@Override
	public void register(User user) {
		for(ValidatorService validatorService : this.validatorServices) {
			if(validatorService.checker(user)==false) {
				System.out.println("Kay�d�n�z ger�ekle�tirilemedi!!");
				return;
			}
		}
		System.out.println("Kayd�n�z ba�ar�yla ger�ekle�mi�tir.");
		this.dataAccess.add(user);
		users.add(user);
		
			
		
	}

	@Override
	public void login(User user) {
		for (User user1 : users) {
			if(user.geteMail()==user.geteMail() && user.getPassword()== user.getPassword()) {
				System.out.println("Ho�geldiniz : "+user.getFirstName()+" "+user.getLastName());
				return;
		    }	
	    }
		System.out.println("Giri� ba�ar�s�z oldu.");
		
	}

	@Override
	public ArrayList<User> GetAllUsers() {
		return this.users;
	}
	
	

}
