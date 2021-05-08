package business.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User getByEmail(String eMail);
	User getByEmailandPassword(String eMail, String password);
	User verifyByEmailandPassword(String eMail, String password);
	List<User> getAll();
}
