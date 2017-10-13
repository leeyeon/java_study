package jb05.part08

public class HanmiBank extends Bank implements Deposit,PayOut{

public HanmiBank(){

}  

public HanmiBank(String name){
	super(name);
}

public void display(){
	System.out.println("은행명"+this.getName());
}

public void display(int money){
	System.out.println(money+"를 입금합니다. ");
}

public void display(){
	System.out.println(money+"를 출금합니다. ");
}

public static void main(String args[]){

	HnamiBank hb = new HanmiBank("한미은행");
	hb.dispaly();
	hb.deposit(100);
	hb.payOut(200);

	System.out.println(Deposit.deposit);
	System.out.println(hb.payOut);

}
}