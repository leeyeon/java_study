//package jb04.part01;

public class Bank02
{
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank02(){
	}
	public Bank02(String[] str){
		userName=str[0];
		bankName=str[1];
		command=Integer.parseInt(str[2]);
		money=Integer.parseInt(str[3]);
	}
	
	public void work(){
		if(command==1){
			deposit();
		}
		else if(command==2){
			withdrawal();	
		}
	}

	public void deposit(){
		balance += money;
		System.out.println(money+"원 출금함.");
	}

	public void withdrawal(){
		balance -=money;
		System.out.println(money+"원 출금함.");
	}

	public void displayMoney(){
		System.out.println("현재 금액은: "+balance+"입니다");
	}
	
	public static void main(String args[]){
		if(!(args.length == 2 || args.length == 4)){
			System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
			System.out.println("[usuage]:: 인자값이 2, 4개가 필요합니다");
			System.exit(0);
		}

		System.out.println(args[0]+"님의 주거래은행은"+args[1]+" 입니다");

		Bank02 b = new Bank02();

		if(args.length !=2) {
			int command = Integer.parseInt(args[2]);

			if(command !=1 && command !=2){
				System.out.println("[usage]:: java Bank02 [customerName][bankName][option][money]");
				System.out.println("[usuage]:: option을 확인하세요 :: 1 => 입금, 2 ==> 출금");
				return;
			}

			b= new Bank02(args);

			b.work();
		}

		b.displayMoney();

	}
}