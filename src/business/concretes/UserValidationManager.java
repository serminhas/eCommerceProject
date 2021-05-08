package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserValidationService;
import eCommerceProject.entities.concretes.User;

public class UserValidationManager implements UserValidationService {
	
	//java code in order to validate email addresses
	
	public static final Pattern validateEmailAddressWithRegex  = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	private boolean validateEmailFormat(String eMail) {
		
		return validateEmailAddressWithRegex.matcher(eMail).find();
	}
	
	/*private boolean checkEmailIfAlreadyRegistered(String eMail, List<User> userList ){
		for (User user : userList) {
			if (user.geteMail()==eMail) {
				System.out.println("This email has been already registered!");
				return false;
			}
		}
		return true;
	}*/
	
	private boolean validatePasswordLength(String password) {
		return password.length()>6;
	}
	
	private boolean validateFirstNameLength(String firstName) {
		return firstName.length()>2;
	}
	
	private boolean validateLastNameLength(String lastName) {
		return lastName.length()>2;
	}
	
	//Return false if even one condition is not met
	public boolean run(boolean...all) {
		for (boolean b : all) {
			if (!b) {
				return false;
			} 
		}
		return true;
	}
	
	public boolean validateAllFields(User user, List<User> userList) {
		return run(validateEmailFormat(user.geteMail()), 
				validatePasswordLength(user.getPassword()), validateFirstNameLength(user.getFirstName()), 
						validateLastNameLength(user.getLastName()));
	}
	
	

}
