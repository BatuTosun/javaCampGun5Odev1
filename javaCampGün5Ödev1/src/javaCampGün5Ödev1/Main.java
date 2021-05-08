package javaCampG�n5�dev1;

import java.util.ArrayList;

import javaCampG�n5�dev1.business.Abstract.UserService;
import javaCampG�n5�dev1.business.Concrete.GoogleUserManager;
import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.core.Concretes.EmailCheckValidator;
import javaCampG�n5�dev1.core.Concretes.NameCheckValidator;
import javaCampG�n5�dev1.core.Concretes.PasswordCheckValidator;
import javaCampG�n5�dev1.dataAccess.Concretes.DatabaseUserDao;
import javaCampG�n5�dev1.entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		ValidatorService[] validatorServices = {new EmailCheckValidator(),new NameCheckValidator(),new PasswordCheckValidator()};
		
		UserService userService = new GoogleUserManager(validatorServices,new DatabaseUserDao(),new ArrayList<User>());
		
		User user1 = new User(1,"Batu","Tosun","deneme@gmail.com","123456");
		userService.register(user1);
		
		User user2 = new User(1,"Batu2","Tosun2","deneme2@gmail.com","123456");
		userService.register(user2);
		
		User signIn = new User("deneme@gmail.com","12345");
		userService.login(signIn);
		
		System.out.println("Kay�tl� T�m kullan�c�lar :");
		for (User user : userService.GetAllUsers()) {
			System.out.println("Kullan�c� Ad� : "+user.getFirstName()+" "+user.getLastName());

	}
}	
}	


