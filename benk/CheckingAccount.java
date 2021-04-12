package benk;

public class CheckingAccount extends BankAccount{
private double serviceCharge;//服务费

public CheckingAccount() {
	super();
}

public CheckingAccount(String accountNum, double blance, double serviceCharge) {
	super(accountNum, blance);
	this.serviceCharge = serviceCharge;
}

public double getServiceCharge() {
	return serviceCharge;
}

public void setServiceCharge(double serviceCharge) {
	this.serviceCharge = serviceCharge;
}
public double assessserviceCharge(double blance, double serviceCharge) {//手续费
	blance =blance-serviceCharge;
	return blance;
}
@Override
public String toString() {
	String mai="";
	mai= super.toString() +"serviceCharge=" + serviceCharge;
	return mai;
}


}
