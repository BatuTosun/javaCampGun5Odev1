package javaCampGün5Ödev1.business.Concrete;

import java.util.ArrayList;

import javaCampGün5Ödev1.business.Abstract.UserService;
import javaCampGün5Ödev1.core.Abstract.ValidatorService;
import javaCampGün5Ödev1.dataAccess.Abstract.UserDao;
import javaCampGün5Ödev1.entities.Concretes.User;

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
				System.out.println("Kayýt baþarýsýz oldu");
				return;
			}
		}
		System.out.println("Google doðrulamasý baþarýlý.");
		this.dataAccess.add(user);
		users.add(user);
		

	}

	@Override
	public void login(User user) {
		for (User user1 : users) {
			{
				System.out.println("Google hesabýnýzla giriþ yaptýnýz.Hoþgeldiniz : "+user.getFirstName()+" "+user.getLastName());
				return;
		    }	
	    }
		System.out.println("Kayýt baþarýsýz.");
}

	
	@Override
	public ArrayList<User> GetAllUsers() {
		
		return this.users;
	}

}
