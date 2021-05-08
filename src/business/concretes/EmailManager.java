package business.concretes;

import business.abstracts.EmailService;

public class EmailManager implements EmailService {
	
	@Override
	public void send(String message) {
		System.out.println(message);		
	}

}
