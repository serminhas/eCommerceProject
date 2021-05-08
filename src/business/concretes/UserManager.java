package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		
		this.userDao=userDao;
	}
		
	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	

	@Override
	public User get(int id) {
		
		return userDao.get(id);
	}

	@Override
	public User getByEmail(String eMail) {
		
		return userDao.getByEmail(eMail);
	}

	@Override
	public User getByEmailandPassword(String eMail, String password) {
		
		return userDao.getByEmailandPassword(eMail, password);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	

	@Override
	public User verifyByEmailandPassword(String eMail, String password) {
		return userDao.getByEmailandPassword(eMail, password);
	}

}
