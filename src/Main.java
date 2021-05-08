import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserLoginService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserLoginManager;
import business.concretes.UserManager;
import business.concretes.UserValidationManager;
import core.GoogleAuthManagerAdapter;
import dataAccess.concretes.MemoryUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		UserService userService=new UserManager(new MemoryUserDao());
		EmailService emailService=new EmailManager();
		UserLoginService userLoginService=new UserLoginManager();
		UserValidationService userValidationService=new UserValidationManager();
		
		AuthService authService = new AuthManager(userService, emailService , userValidationService, userLoginService);
		authService.register(1, "sermin.has@gmail.com", "123srmn1234", "Sermin", "Has"); 
		//authService.login("sermin.has@gmail.com", "123srmn1234"); 
		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(2, "onur.has@gmail.com", "123onur1234", "Onur", "Has");
		googleAuthService.login("onur.has@gmail.com", "123onur1234");
	}

}
