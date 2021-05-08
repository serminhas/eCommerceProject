package business.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface UserLoginService {
	boolean checkEmailAndPassword(User user);
}
