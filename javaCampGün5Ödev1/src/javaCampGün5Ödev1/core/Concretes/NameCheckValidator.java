package javaCampGün5Ödev1.core.Concretes;

import javaCampGün5Ödev1.core.Abstract.ValidatorService;
import javaCampGün5Ödev1.entities.Concretes.User;

public class NameCheckValidator implements ValidatorService{
	
	@Override
	public boolean checker(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Adýnýz ve Soyadýnýz 2 harften uzun olmaýldýr!");
			return false;
		}

	}
}	
