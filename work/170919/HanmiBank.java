package jb05.part08

public class HanmiBank extends Bank implements Deposit,PayOut{

public HanmiBank(){

}  

public HanmiBank(String name){
	super(name);
}

public void display(){
	System.out.println("�����"+this.getName());
}

public void display(int money){
	System.out.println(money+"�� �Ա��մϴ�. ");
}

public void display(){
	System.out.println(money+"�� ����մϴ�. ");
}

public static void main(String args[]){

	HnamiBank hb = new HanmiBank("�ѹ�����");
	hb.dispaly();
	hb.deposit(100);
	hb.payOut(200);

	System.out.println(Deposit.deposit);
	System.out.println(hb.payOut);

}
}