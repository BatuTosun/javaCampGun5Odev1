package javaCampG�n5�dev1.core.Concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.entities.Concretes.User;

public class PasswordCheckValidator implements ValidatorService{
	
	String passwordPattern = "^.{6,}$";
	Pattern pattern = Pattern.compile(passwordPattern);


	@Override
	public boolean checker(User user) {
		Matcher matcher = pattern.matcher(user.getPassword());

		if(matcher.matches()) {
			return true;
		}else {
			System.out.println("Parolan�z�n uzunlu�u 5 karakterden uzun olma�ld�r!");
			return false;
		}

	}

}
