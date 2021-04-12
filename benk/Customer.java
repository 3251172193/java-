package benk;

public class Customer {
private String ssn;//身份证号
private String name;//姓名
private CheckingAccount ca;//信用卡
private SavingsAccount sa;//存储卡
public Customer() {
	super();
}
public Customer(String ssn, String name, CheckingAccount ca, SavingsAccount sa) {
	super();
	this.ssn = ssn;
	this.name = name;
	this.ca = ca;
	this.sa = sa;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public CheckingAccount getCa() {
	return ca;
}
public void setCa(CheckingAccount ca) {
	this.ca = ca;
}
public SavingsAccount getSa() {
	return sa;
}
public void setSa(SavingsAccount sa) {
	this.sa = sa;
}
@Override
public String toString() {
	String mai="";
	mai="ssn=" + ssn + ", name=" + name + ", " + ca + ", " + sa;
	return mai;
}
}
