package javaCampGün5Ödev1;

import java.util.ArrayList;

import javaCampGün5Ödev1.business.Abstract.UserService;
import javaCampGün5Ödev1.business.Concrete.GoogleUserManager;
import javaCampGün5Ödev1.core.Abstract.ValidatorService;
import javaCampGün5Ödev1.core.Concretes.EmailCheckValidator;
import javaCampGün5Ödev1.core.Concretes.NameCheckValidator;
import javaCampGün5Ödev1.core.Concretes.PasswordCheckValidator;
import javaCampGün5Ödev1.dataAccess.Concretes.DatabaseUserDao;
import javaCampGün5Ödev1.entities.Concretes.User;

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
		
		System.out.println("Kayýtlý Tüm kullanýcýlar :");
		for (User user : userService.GetAllUsers()) {
			System.out.println("Kullanýcý Adý : "+user.getFirstName()+" "+user.getLastName());

	}
}	
}	


