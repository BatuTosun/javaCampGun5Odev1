package javaCampGün5Ödev1.dataAccess.Concretes;

import javaCampGün5Ödev1.dataAccess.Abstract.UserDao;
import javaCampGün5Ödev1.entities.Concretes.User;

public class DatabaseUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Database giriþ yapýldý : "+user.getFirstName()+" "+user.getLastName());
		
	}

}
