package ibmtal.trendyol.dto;

public class MyAccountDto {
private int id;
private String changename;
private String changeage;
private String changeemail;
private String changephonenumber;
private String changepassword;
private String changesurname;
private String changeusername;
public MyAccountDto() {
	super();
}
public MyAccountDto(int id, String changename, String changeage, String changeemail, String changephonenumber,
		String changepassword, String changesurname, String changeusername) {
	super();
	this.id = id;
	this.changename = changename;
	this.changeage = changeage;
	this.changeemail = changeemail;
	this.changephonenumber = changephonenumber;
	this.changepassword = changepassword;
	this.changesurname = changesurname;
	this.changeusername = changeusername;
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


}
