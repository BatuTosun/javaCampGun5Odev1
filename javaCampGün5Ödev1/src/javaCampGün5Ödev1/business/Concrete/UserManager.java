package javaCampGün5Ödev1.business.Concrete;

import java.util.ArrayList;

import javaCampGün5Ödev1.business.Abstract.UserService;
import javaCampGün5Ödev1.core.Abstract.ValidatorService;
import javaCampGün5Ödev1.dataAccess.Abstract.UserDao;
import javaCampGün5Ödev1.entities.Concretes.User;

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
				System.out.println("Kayýdýnýz gerçekleþtirilemedi!!");
				return;
			}
		}
		System.out.println("Kaydýnýz baþarýyla gerçekleþmiþtir.");
		this.dataAccess.add(user);
		users.add(user);
		
			
		
	}

	@Override
	public void login(User user) {
		for (User user1 : users) {
			if(user.geteMail()==user.geteMail() && user.getPassword()== user.getPassword()) {
				System.out.println("Hoþgeldiniz : "+user.getFirstName()+" "+user.getLastName());
				return;
		    }	
	    }
		System.out.println("Giriþ baþarýsýz oldu.");
		
	}

	@Override
	public ArrayList<User> GetAllUsers() {
		return this.users;
	}
	
	

}
