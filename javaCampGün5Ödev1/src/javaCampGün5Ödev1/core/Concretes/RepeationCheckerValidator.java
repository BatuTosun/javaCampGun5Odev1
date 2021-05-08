package javaCampGün5Ödev1.core.Concretes;


import java.util.ArrayList;


import javaCampGün5Ödev1.entities.Concretes.User;

public class RepeationCheckerValidator {
	

	private ArrayList<String> mailControlList;


	public RepeationCheckerValidator(ArrayList<String> mailControlList) {
		this.mailControlList = mailControlList;
	
	}

	
	public boolean checker (User user) {
		if(this.mailControlList.isEmpty()) {
			System.out.println("E-Mail baþarýyla eklendi.");
			this.mailControlList.add(user.geteMail());
			return true;
		}else{
			for(String mail:this.mailControlList) {
				if(mail==user.geteMail()) {
					System.out.println("Bu E-mail þu anda kullanýlmaktadýr.");
					return false;
				}
			}
			System.out.println("E-Mail baþarýyla eklendi.");
			this.mailControlList.add(user.geteMail());
			return true;

		}
	}
}	


