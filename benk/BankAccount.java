package benk;

public class BankAccount {
private String accountNum;//ø®∫≈
private double blance;//”‡∂Ó
public BankAccount() {
	super();
}
public BankAccount(String accountNum, double blance) {
	super();
	this.accountNum = accountNum;
	this.blance = blance;
}
public String getAccountNum() {
	return accountNum;
}
public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
}
public double getBlance() {
	return blance;
}
public void setBlance(double blance) {
	this.blance = blance;
}
@Override
public String toString() {
	String mai="";
	mai="accountNum=" + accountNum + ", blance=" + blance ;
	return mai;
}

}
