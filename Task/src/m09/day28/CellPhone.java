package m09.day28;

public class CellPhone {
	
	private String model;
	private double battery;

	public CellPhone() {
	}
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) throws IllegalArgumentException {
		if(time > 0) {
			System.out.println("��ȭ �ð� : "+time+"��");
			battery -= time*0.5;
		} else {
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		}
		
		if(battery < 0) battery = 0;
	}
	
	public void charge(int time) throws IllegalArgumentException {
		if(time > 0) {
			System.out.println("���� �ð� : "+time+"��");
			battery += time*3;
		} else {			
			throw new IllegalArgumentException("�����ð��Է¿���");
		}
		if(battery > 100) battery = 100;

	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : " + battery);
	}
	
	public boolean equals(Object otherObject) {
		
		if(otherObject == null) {
			return false;
		} else if(otherObject instanceof CellPhone) { //��ü ������?
			//�� ������?
			if(getModel().equals(((CellPhone)otherObject).getModel()))
				return true;
			else return false;
		} else {
			return false;
		}
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

}