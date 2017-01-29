package net.tzvikaco.component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import net.tzvikaco.Contact;
import net.tzvikaco.hibernate.HibernateUtils;

@Component
public class ContactService implements IContactService {

	@Override
	public Contact getContactDetails(Integer id) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		//Since session.load(Contact.class, id) throws exception for serailization 
		//we use the "get" method - session.get(Contact.class, id)
//		Contact contact = session.get(Contact.class, id);
		Contact contact = session.load(Contact.class, id);
		return contact;
	}

}
