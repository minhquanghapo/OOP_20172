class BankAcount
{
	public final int MIN_BALANCE = 50000;
	String fullName;
	int age;
	boolean sex;
	int balance;
	final boolean Male = true;
	final boolean Female = false;
	public BankAcount() {

	}
	public BankAcount(String fullName, boolean sex, int age) {
		this.fullName = fullName;
		this.age = age;
		if(sex == true) this.sex = Male;
		else this.sex = Female;
		this.balance = MIN_BALANCE;
		System.out.println("Ho ten: " + this.fullName + "\n Age: " + this.age + "\n Sex: " + this.sex);
	}

	public int Debit(int debitBlance)
	{
		if(this.balance < MIN_BALANCE) {
			System.out.println("Giao dich that bai!!");
			return this.balance;
		}
		System.out.println("Giao dich thanh cong, so tien trong tai khoan la: !!" + (this.balance+ debitBlance));
		this.balance = this.balance + debitBlance;
		return this.balance;
	}

	public int Credit(int creditBlance)
	{
		if((this.balance - creditBlance) <= MIN_BALANCE) 
		{
			System.out.println("Giao dich that bai so tien trong tai khoan khong du");
			return this.balance;
		}
		System.out.println("Giao dich thanh cong, so tien trong tai khoan la: !!" + (this.balance - creditBlance));
		return this.balance -= creditBlance;
	}

	public int test(float x)
	{
		 System.out.println("1");
		 return 1;
	}
}

public class TestClassBankAcount
{
	public static void main(String args[]) {
	BankAcount bka = new BankAcount("Hoang Minh Quang", true, 18);
	bka.Debit(100000);
	bka.Credit(50000);
	float z = 0;
	}
}