package javaCampGün5Ödev1.core.Concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampGün5Ödev1.core.Abstract.ValidatorService;
import javaCampGün5Ödev1.entities.Concretes.User;

public class PasswordCheckValidator implements ValidatorService{
	
	String passwordPattern = "^.{6,}$";
	Pattern pattern = Pattern.compile(passwordPattern);


	@Override
	public boolean checker(User user) {
		Matcher matcher = pattern.matcher(user.getPassword());

		if(matcher.matches()) {
			return true;
		}else {
			System.out.println("Parolanýzýn uzunluðu 5 karakterden uzun olmaýldýr!");
			return false;
		}

	}

}
