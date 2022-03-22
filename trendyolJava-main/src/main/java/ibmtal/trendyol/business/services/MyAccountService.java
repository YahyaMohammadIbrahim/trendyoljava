package ibmtal.trendyol.business.services;

import java.util.ArrayList;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.User;

public interface MyAccountService {
ArrayList<MyAccount> getAll();
Result<MyAccount> addMyAccount(MyAccount myaccount);
Result<MyAccount> addMyAccountDto(MyAccountDto myaccountDto);
Result<User> getMyAccount(Integer id);

}
