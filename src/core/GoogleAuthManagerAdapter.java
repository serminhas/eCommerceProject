package core;

import GoogleAuth.GoogleAuthManager;
import business.abstracts.AuthService;

public class GoogleAuthManagerAdapter implements AuthService {

	GoogleAuthManager manager=new GoogleAuthManager();
	
	@Override
	public void register(int id, String eMail, String password, String firstName, String lastName) {
		manager.register(id, eMail, password, firstName, lastName);
	}

	@Override
	public void login(String eMail, String password) {	
		manager.login(eMail, password);
	}

}
