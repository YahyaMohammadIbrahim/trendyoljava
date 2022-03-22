package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;

@RestController
@RequestMapping("/api/myaccount")
public class MyAccountController {
	private MyAccountService myAccountService;
	@Autowired
	public MyAccountController(MyAccountService myAccountService) {
		super();
		this.myAccountService = myAccountService;
	}
@PostMapping("/add")
public Result<MyAccount> addMyAccount(@RequestBody MyAccount myaccount) {
	return this.myAccountService.addMyAccount(myaccount);
	
}
@PostMapping("/adduser")
public Result<MyAccount> addMyAccount(@RequestBody MyAccountDto myaccountDto) {
	return this.myAccountService.addMyAccountDto(myaccountDto);
	
}
}
