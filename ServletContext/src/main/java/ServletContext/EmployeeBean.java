package ServletContext;

public class EmployeeBean {
private String EmpName;
private String EmpId;
private String EmpFName;
private String EmpLName;
private String EmpMail;
private String EmpPhNo;
private String State;
private String Country;
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
public String getEmpFName() {
	return EmpFName;
}
public void setEmpFName(String empFName) {
	EmpFName = empFName;
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
public String getEmpPhNo() {
	return EmpPhNo;
}
public void setEmpPhNo(String empPhNo) {
	EmpPhNo = empPhNo;
}
@Override
public String toString() {
	return "EmployeeBean [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpFName=" + EmpFName + ", EmpLName=" + EmpLName
			+ ", EmpMail=" + EmpMail + ", EmpPhNo=" + EmpPhNo + ", State=" + State + ", Country=" + Country + "]";
}


}
