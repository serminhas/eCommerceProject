package business.abstracts;

import java.util.List;
import java.util.regex.Pattern;
import eCommerceProject.entities.concretes.User;

public interface UserValidationService {
	boolean validateAllFields(User user, List<User> userList);
	
}


