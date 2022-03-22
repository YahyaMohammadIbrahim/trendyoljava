package ibmtal.trendyol.business.managers;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.core.result.ResultItem;
import ibmtal.trendyol.database.MyAccountDao;
import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.User;
@Service
public class MyAccountManager implements MyAccountService{
private MyAccountDao myaccountDao;

public MyAccountManager(MyAccountDao myaccountDao) {
	super();
	this.myaccountDao = myaccountDao;
}

@Override
public ArrayList<MyAccount> getAll() {
	
	return new ArrayList<MyAccount>(this.myaccountDao.findAll());
}

@Override
public Result<MyAccount> addMyAccount(MyAccount myaccount) {
	Result<MyAccount> result=new Result<MyAccount>();
	if(myaccount.getChangename().isBlank()==true) {
		result.setSuccess(false);
		result.getErrors().add(
		 new ResultItem("Changename", "You cannot leave your new name as empty!! ")
		);
		if(myaccount.getChangepassword().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			 new ResultItem("Changepassword", "You cannot leave your new password as empty!!"));
		}
	}
	if(myaccount.getChangepassword().length()<8) {
		result.setSuccess(false);
		result.getErrors().add(
		 new ResultItem("changepassword", "You cannot leave your new password below 8 characters!")
		);
	}
	if(myaccount.getChangeemail().isBlank()==true) {
		result.setSuccess(false);
		result.getErrors().add(
		 new ResultItem("changeemail", "You cannot leave your new Email as empty!!")
		);
		if(myaccount.getChangeusername().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			 new ResultItem("ChangeUsername", "You cannot leave your new username as empty!!")
			);
		}
	}
	if(myaccount.getChangephonenumber().isBlank()==true) {
		result.setSuccess(false);
		result.getErrors().add(
		 new ResultItem("phonenumber", "You cannot leave your new phone number as blank!")
		);
	}
	if(result.getSuccess()!=false) {
		this.myaccountDao.save(myaccount);
	}
	return result;
}

@Override
public Result<MyAccount> addMyAccountDto(MyAccountDto myaccountDto) {
	Result<MyAccount> result=new Result<MyAccount>();
	MyAccount myaccount= new MyAccount();
	myaccount.setChangeusername(myaccountDto.getChangeusername());
	myaccount.setChangename(myaccountDto.getChangename());
	myaccount.setChangeage(myaccountDto.getChangeage());
	myaccount.setChangeemail(myaccountDto.getChangeemail());
	myaccount.setChangepassword(myaccountDto.getChangepassword());
	myaccount.setChangesurname(myaccountDto.getChangesurname());
	myaccount.setChangephonenumber(myaccountDto.getChangephonenumber());
	this.myaccountDao.save(myaccount);
	ArrayList<MyAccount> accountlist=new ArrayList<MyAccount>();
	accountlist.add(myaccount);
	result.setData(accountlist);

	return result;

}

@Override
public Result<User> getMyAccount(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
}
