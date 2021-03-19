package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Phone타입의 smartPhone
		Phone phone1 = new SmartPhone();
		phone1.sendCall();
		((Computable)phone1).playApp();
		
		//2.Computable타입의smatphone
		Computable phone2 = new SmartPhone();
		((Phone)phone2).sendCall();
		phone2.playApp();
		
		//3.SmartPhon 타입의 smarthome
		SmartPhone phone3 = new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
	}

}
