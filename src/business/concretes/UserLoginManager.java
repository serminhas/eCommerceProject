package business.concretes;

import java.util.List;

import business.abstracts.EmailService;
import business.abstracts.UserLoginService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import dataAccess.concretes.MemoryUserDao;
import eCommerceProject.entities.concretes.User;

public class UserLoginManager implements UserLoginService{
	UserService userService=new UserManager(new MemoryUserDao());
	
	private boolean checkIfUserExists(String eMail, String password) {
		return userService.getByEmailandPassword(eMail, password) != null;
	}
	
	

	@Override
	public boolean checkEmailAndPassword(User user) {	
		return checkIfUserExists(user.geteMail(), user.getPassword());	
	}	

}
