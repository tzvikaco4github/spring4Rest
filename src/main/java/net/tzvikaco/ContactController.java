package net.tzvikaco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.tzvikaco.component.IContactService;

@RestController
@RequestMapping("/data2")
public class ContactController {
	@Autowired
	private IContactService contactService;
	
	@RequestMapping("/contact")
	public Contact getContactDetails(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Integer id) {
		Contact p = contactService.getContactDetails(id);
		return p;
	}
}