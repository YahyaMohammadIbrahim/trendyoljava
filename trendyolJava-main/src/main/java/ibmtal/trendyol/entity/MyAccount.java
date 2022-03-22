package ibmtal.trendyol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myaccount")
public class MyAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="changename")
	private String changename;
	@Column(name="changeage")
	private String changeage;
	@Column(name="changeemail")
	private String changeemail;
	@Column(name="changephonenumber")
	private String changephonenumber;
	@Column(name="changepassword")
	private String changepassword;
	@Column(name="changesurname")
	private String changesurname;
	@Column(name="changeusername")
	private String changeusername;
	@Column(name="accountype")
	private String accountype;
	public MyAccount() {
		super();
	}
	public MyAccount(int id, String changename, String changeage, String changeemail, String changephonenumber,
			String changepassword, String changesurname, String changeusername, String accountype) {
		super();
		this.id = id;
		this.changename = changename;
		this.changeage = changeage;
		this.changeemail = changeemail;
		this.changephonenumber = changephonenumber;
		this.changepassword = changepassword;
		this.changesurname = changesurname;
		this.changeusername = changeusername;
		this.accountype = accountype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChangename() {
		return changename;
	}
	public void setChangename(String changename) {
		this.changename = changename;
	}
	public String getChangeage() {
		return changeage;
	}
	public void setChangeage(String changeage) {
		this.changeage = changeage;
	}
	public String getChangeemail() {
		return changeemail;
	}
	public void setChangeemail(String changeemail) {
		this.changeemail = changeemail;
	}
	public String getChangephonenumber() {
		return changephonenumber;
	}
	public void setChangephonenumber(String changephonenumber) {
		this.changephonenumber = changephonenumber;
	}
	public String getChangepassword() {
		return changepassword;
	}
	public void setChangepassword(String changepassword) {
		this.changepassword = changepassword;
	}
	public String getChangesurname() {
		return changesurname;
	}
	public void setChangesurname(String changesurname) {
		this.changesurname = changesurname;
	}
	public String getChangeusername() {
		return changeusername;
	}
	public void setChangeusername(String changeusername) {
		this.changeusername = changeusername;
	}
	public String getAccountype() {
		return accountype;
	}
	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}
	
		
	}
	
	
	

