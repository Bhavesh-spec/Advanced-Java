package Sessions;

public class EmpBean {
private String EmpName;
private String EmpId;
private String EmpfName;
private String EmpLName;
private String EmpMail;
private String EmpPhone;
private String State;
private String Country;
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public String getEmpId() {
	return EmpId;
}
public void setEmpId(String empId) {
	EmpId = empId;
}
public String getEmpfName() {
	return EmpfName;
}
public void setEmpfName(String empfName) {
	EmpfName = empfName;
}
public String getEmpLName() {
	return EmpLName;
}
public void setEmpLName(String empLName) {
	EmpLName = empLName;
}
public String getEmpMail() {
	return EmpMail;
}
public void setEmpMail(String empMail) {
	EmpMail = empMail;
}
public String getEmpPhone() {
	return EmpPhone;
}
public void setEmpPhone(String empPhone) {
	EmpPhone = empPhone;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Override
public String toString() {
	return "EmpBean [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpfName=" + EmpfName + ", EmpLName=" + EmpLName
			+ ", EmpMail=" + EmpMail + ", EmpPhone=" + EmpPhone + ", State=" + State + ", Country=" + Country + "]";
}
}
