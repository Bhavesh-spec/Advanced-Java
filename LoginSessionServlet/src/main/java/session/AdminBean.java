package session;
public class AdminBean {
private String adminName;
private String adminPass;
private String adminFName;
private String adminLName;
private String adminMailId;
private String adminPhno;
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminPass() {
	return adminPass;
}
public void setAdminPass(String adminPass) {
	this.adminPass = adminPass;
}
public String getAdminFName() {
	return adminFName;
}
public void setAdminFName(String adminFName) {
	this.adminFName = adminFName;
}
public String getAdminLName() {
	return adminLName;
}
public void setAdminLName(String adminLName) {
	this.adminLName = adminLName;
}
public String getAdminMailId() {
	return adminMailId;
}
public void setAdminMailId(String adminMailId) {
	this.adminMailId = adminMailId;
}
public String getAdminPhno() {
	return adminPhno;
}
public void setAdminPhno(String adminPhno) {
	this.adminPhno = adminPhno;
}
@Override
public String toString() {
	return "AdminBean [adminName=" + adminName + ", adminPass=" + adminPass + ", adminFName=" + adminFName
			+ ", adminLName=" + adminLName + ", adminMailId=" + adminMailId + ", adminPhno=" + adminPhno + "]";
}
}
