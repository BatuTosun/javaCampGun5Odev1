package javaCampG�n5�dev1.business.Concrete;

import java.util.ArrayList;

import javaCampG�n5�dev1.business.Abstract.UserService;
import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.dataAccess.Abstract.UserDao;
import javaCampG�n5�dev1.entities.Concretes.User;

public class GoogleUserManager implements UserService{
	
	private ValidatorService[] validatorServices;
	private UserDao dataAccess;
	private ArrayList<User> users;

	public GoogleUserManager(ValidatorService[] validatorServices,UserDao dataAccess,ArrayList<User> users) {
		this.validatorServices = validatorServices;
		this.dataAccess = dataAccess;
		this.users = users;

	}

	@Override
	public void register(User user) {
		for (ValidatorService validatorService : this.validatorServices) {
			if (validatorService.checker(user)==false) {
				System.out.println("Kay�t ba�ar�s�z oldu");
				return;
			}
		}
		System.out.println("Google do�rulamas� ba�ar�l�.");
		this.dataAccess.add(user);
		users.add(user);
		

	}

	@Override
	public void login(User user) {
		for (User user1 : users) {
			{
				System.out.println("Google hesab�n�zla giri� yapt�n�z.Ho�geldiniz : "+user.getFirstName()+" "+user.getLastName());
				return;
		    }	
	    }
		System.out.println("Kay�t ba�ar�s�z.");
}

	
	@Override
	public ArrayList<User> GetAllUsers() {
		
		return this.users;
	}

}
