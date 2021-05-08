package dataAccess.abstracts;

import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface UserDao {
		void add(User user);
		void update(User user);
		void delete(User user);
		User getByEmail(String Email);
		User getByEmailandPassword(String eMail, String password);
		User verifyByEmailandPassword(String eMail, String password);
		User get(int id);
		List<User> getAll();
		
}
