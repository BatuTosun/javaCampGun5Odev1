package javaCampG�n5�dev1.core.Concretes;

import javaCampG�n5�dev1.core.Abstract.ValidatorService;
import javaCampG�n5�dev1.entities.Concretes.User;

public class NameCheckValidator implements ValidatorService{
	
	@Override
	public boolean checker(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Ad�n�z ve Soyad�n�z 2 harften uzun olma�ld�r!");
			return false;
		}

	}
}	
