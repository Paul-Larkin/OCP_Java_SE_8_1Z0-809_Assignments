package concurrency;

import java.util.ArrayList;
import java.util.List;

public class Assginment7_8 {

	public static void main(String[] args) {
		Server s = new Server();
		Client c = new Client(s, new CurrencyFXTransaction("Sterling", 100f, 0.85f));
		Client c2 = new Client(s, new CurrencyFXTransaction("Dollar", 1000f, 1.125f));
		s.start();
		c.start();
		c2.start();
	}
}

class Server extends Thread {
	List<CurrencyFXTransaction> list = new ArrayList<>();
	
	public void convert(CurrencyFXTransaction amount) {
		synchronized(list) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(amount);
			list.notify();
		}
	}
	
	public void run() {
		while(true) {
			synchronized(list) {
				while(list.isEmpty()) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
			System.out.println("Server reply:... " + list.get(0).getCurrencyAmount() * 0.87 + " " + list.get(0).getCurrencyName());
			list.remove(0);
		}
	}
}

class Client extends Thread {
	private Server server;
	private CurrencyFXTransaction transaction;

	public Client(Server server, CurrencyFXTransaction transaction) {
		this.server = server;
		this.transaction = transaction;
	}

	public void setServer(Server server){
		  this.server = server;	 
	}
	
	public void run() {
		//while(true) {
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " is sending FX request of... " + transaction.getCurrencyAmount() + " Euro");
				server.convert(transaction);
			} catch (InterruptedException e) {
			
			}
		//}
	}
}

class CurrencyFXTransaction {
	String currencyName;
	float currencyAmount;
	float exchangeRate;
	
	public CurrencyFXTransaction(String currencyName, float currencyAmount, float exchangeRate){
		this.currencyName = currencyName;
		this.currencyAmount = currencyAmount;
		this.exchangeRate = exchangeRate;

	}

	public String getCurrencyName() {
		return currencyName;
	}

	public float getCurrencyAmount() {
		return currencyAmount;
	}

	public float getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
