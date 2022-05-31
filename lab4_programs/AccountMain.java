package lab4_programs;

import java.util.concurrent.atomic.AtomicInteger;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Person smith = new Person("Smith", 23);
		Person kitty = new Person("Kitty", 31);
		AtomicInteger count = new AtomicInteger(0);
		Account smithaccount = new Account(count.incrementAndGet(), 2000, smith);
		Account kittyaccount = new Account(count.incrementAndGet(), 3000, kitty);
		
		System.out.println(smithaccount);
		System.out.println(kittyaccount);
		
		smithaccount.deposit(2000);
		kittyaccount.withdraw(2000);
		
		System.out.println("Balance in Smith's Account: ");
		smithaccount.getBalance();
		System.out.println("Balance in Kitty's Account: ");
		kittyaccount.getBalance();
	}

}


	
	