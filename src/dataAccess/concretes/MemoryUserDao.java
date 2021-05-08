package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class MemoryUserDao implements UserDao {
	
	@Override
	public void add(User user) {
		System.out.println( "The user with code " + user.getId() + " has been added to the system.");
	}

	@Override
	public void update(User user) {
		System.out.println("The infos of the user with code " + user.getId() + " has been updated.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("The user with code " + user.getId() + " has been deleted from the system.");
		
	}
	
	List<User> users=new ArrayList();
	@Override
	public User getByEmail(String eMail) {
		for (User user : users) {
			if (user.geteMail()==eMail) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmailandPassword(String eMail, String password) {
		for (User user : users) {
			if (user.geteMail()==eMail && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User verifyByEmailandPassword(String eMail, String password) {
		for (User user : users) {
			if (user.geteMail()==eMail && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	

}
