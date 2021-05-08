package javaCampG�n5�dev1.core.Concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.entities.Concretes.User;

public class EmailCheckValidator implements ValidatorService{

	String mailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(mailPattern,Pattern.CASE_INSENSITIVE);


	@Override
	public boolean checker (User user) {
		Matcher matcher = pattern.matcher(user.geteMail());
		if(matcher.matches()) {
			return true;
		}else {
			System.out.println("L�tfen kullan�labilir karakterler se�iniz!");
			return false;
		}
	}
}
