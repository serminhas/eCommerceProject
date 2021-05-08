package business.concretes;

import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserLoginService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService {

	List<User> userList;
	UserService userService;
	EmailService emailService;
	UserValidationService userValidationService;
	UserLoginService userLoginService;
	
	public AuthManager(UserService userService, EmailService emailService, UserValidationService userValidationService, UserLoginService userLoginService) {
		this.userService=userService;
		this.emailService=emailService;
		this.userValidationService=userValidationService;
		this.userLoginService=userLoginService;
	}
	
	@Override
	public void register(int id, String eMail, String password, String firstName, String lastName) {
		User userToRegister=new User(id, eMail,  password,  firstName,  lastName, false);
		if (!userValidationService.validateAllFields(userToRegister, userList)) {
			System.out.println("Your registration is completed!");
			emailService.send("Click on the link we send to your e-mail address to verify your information!");
			userService.add(userToRegister);
			return;
		}
		else {
			System.out.println("Your registration could not be completed!");
			return;
		}
	}

	@Override
	public void login(String eMail, String password) {
		User userToLogin=userService.getByEmailandPassword(eMail, password);
		if (userLoginService.checkEmailAndPassword(userToLogin)) {
			System.out.println("You logged in to the system!");
			return;
		}
		else {
			System.out.println("You could not log in to the system!");
		}
		
	}

}
