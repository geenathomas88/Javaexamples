package excercises;

public class BankingApplication {
	public static void main(String args[]){
		HDFC hdfc = new HDFC();
		ICICI icici = new ICICI();
	}
}
interface Account {
	int accNo = 00;
	String name = "";
	//public float balance = 0.0f;
	
	void createAccount();
	public float getBalance();
	int getAccno();
	float deposit(float amount);
	float withDraw(float amount);
	float interestRate();	
}

//Interfaces
interface SavingsAccount extends Account{
	float openingBalance();
}

interface MinimumBalanceSavings extends SavingsAccount{
	float minimumBalance();
}
interface StandardSavings extends SavingsAccount{
	
}
interface DepositSavings extends SavingsAccount{}
interface RecurringDepositSavings extends DepositSavings{}
interface FixedDepositSavings extends DepositSavings{}

interface CurrentAccount extends Account{
	int noOfOwners();
}

interface SingleOwnedCurrent extends CurrentAccount{}
interface JointCurrent extends CurrentAccount{}

interface CreditCard {
	float findMonthlyLimit();
	float maxWithdraw();
}

interface GoldCredit extends CreditCard{}
interface PlatinumCredit extends CreditCard{}
interface SilverCredit extends CreditCard{}

interface Loans extends Account{
	float loanEligiblity();
}

interface EducationalLoans extends Loans{}
interface AgriculturalLoans extends Loans{}
interface PersonalLoans extends Loans{}



interface HDFCSavings extends MinimumBalanceSavings,StandardSavings,RecurringDepositSavings,FixedDepositSavings {}
interface ICICISavings extends MinimumBalanceSavings,StandardSavings,RecurringDepositSavings,FixedDepositSavings {}

interface HDFCCurrent extends SingleOwnedCurrent,JointCurrent{}
interface ICICICurrent extends SingleOwnedCurrent,JointCurrent{}

interface HDFCCreditCard extends GoldCredit,SilverCredit,PlatinumCredit{}
interface ICICICreditCard extends GoldCredit,SilverCredit,PlatinumCredit{}

interface HDFCLoans extends EducationalLoans,AgriculturalLoans,PersonalLoans{}
interface ICICILoans extends EducationalLoans,AgriculturalLoans,PersonalLoans{}



abstract class HDFCAccount implements HDFCSavings,HDFCCurrent,HDFCCreditCard,HDFCLoans{}
abstract class ICICIAccount implements ICICISavings,ICICICurrent,ICICICreditCard,ICICILoans{}



class HDFC extends HDFCAccount{
	float balance;
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

	public float deposit(float a) {
		balance = balance+a;
		return balance;
	}

	public float interestRate() {
		// TODO Auto-generated method stub
		return 4.2f;
	}

	public float findMonthlyLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float maxWithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float minimumBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float openingBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getAccno() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float withDraw(float amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int noOfOwners() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float loanEligiblity() {
		// TODO Auto-generated method stub
		return 0;
	}
	}


class ICICI extends ICICIAccount{
	float balance;
	public void createAccount() {
		// TODO Auto-generated method stub
		String name;
		int accNo;
	}

	public float deposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float interestRate() {
		// TODO Auto-generated method stub
		return 3.2f;
	}

	public float findMonthlyLimit() {
		// TODO Auto-generated method stub
		return 20000;
	}

	public float maxWithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float minimumBalance() {
		// TODO Auto-generated method stub
		return 100.0f;
	}

	public float openingBalance() {
		
		return 100.0f;
	}

	public float getBalance() {
		
		return balance;
	}

	public int getAccno() {
		// TODO Auto-generated method stub
		return accNo;
	}

	public float deposit(float a) {
		// TODO Auto-generated method stub
		balance = balance +a;
		return balance;
	}

	public float withDraw(float amount) {
		if(balance < amount)
		return 0;
		else
			{
			balance = amount- balance;
		return balance;}
	}

	public int noOfOwners() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float loanEligiblity() {
		// TODO Auto-generated method stub
		return 0;
	}}