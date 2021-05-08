package javaCampG�n5�dev1.core.Concretes;


import java.util.ArrayList;


import javaCampG�n5�dev1.entities.Concretes.User;

public class RepeationCheckerValidator {
	

	private ArrayList<String> mailControlList;


	public RepeationCheckerValidator(ArrayList<String> mailControlList) {
		this.mailControlList = mailControlList;
	
	}

	
	public boolean checker (User user) {
		if(this.mailControlList.isEmpty()) {
			System.out.println("E-Mail ba�ar�yla eklendi.");
			this.mailControlList.add(user.geteMail());
			return true;
		}else{
			for(String mail:this.mailControlList) {
				if(mail==user.geteMail()) {
					System.out.println("Bu E-mail �u anda kullan�lmaktad�r.");
					return false;
				}
			}
			System.out.println("E-Mail ba�ar�yla eklendi.");
			this.mailControlList.add(user.geteMail());
			return true;

		}
	}
}	


