package javaCampG�n5�dev1.dataAccess.Concretes;

import javaCampG�n5�dev1.dataAccess.Abstract.UserDao;
import javaCampG�n5�dev1.entities.Concretes.User;

public class DatabaseUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Database giri� yap�ld� : "+user.getFirstName()+" "+user.getLastName());
		
	}

}
