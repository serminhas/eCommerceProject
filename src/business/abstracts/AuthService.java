package business.abstracts;

public interface AuthService {
	void register(int id, String eMail, String password, String firstName, String lastName);
	void login(String eMail, String password);
	
}
