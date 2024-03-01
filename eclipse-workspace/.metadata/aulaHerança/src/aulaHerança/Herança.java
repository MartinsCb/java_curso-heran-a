package aulaHerança;

import aulaHerança.Account;
public class Herança {

	public static void main(String[] args) {
		
		Account x = new Account (1020,"Alex",1000.0);
		Account y = new SavingAccount(1023,"Maria",1000.0,0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}
}
