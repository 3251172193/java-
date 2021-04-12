package benk;

public class SavingsAccount extends BankAccount{
private double interesRate;//����

public SavingsAccount() {
	super();
}

public SavingsAccount(String accountNum, double blance, double interesRate) {
	super(accountNum, blance);
	this.interesRate = interesRate;
}

public double getInteresRate() {
	return interesRate;
}

public void setInteresRate(double interesRate) {
	this.interesRate = interesRate;
}
public double payInterest(double blance,double interesRate) {//��Ϣ
	blance = blance*(1+interesRate);
	return blance;
}
@Override
public String toString() {
	String mai="";
	mai=super.toString() + "interesRate=" + interesRate;
	return mai;
}

}
