package ex06_exception_class;

/*
 	예외 클래스는 "직렬화" 를 대비해서 serialversionID를생성하라고 항상 경고를 띄웁니다.
 	"직렬화" 처리할 필요가 없다면, 경고 메시지를 무시하라는 @SurprressWarnings 에너테이션을 추가합니다.
 	
 */

//@SuppressWarnings("serial")
@SuppressWarnings("serial")
public class UpDownException extends Exception {
	//예외클래스는 ㅈ로 어떤 일을 수해하냐면,
	//예외메시지(예외가 발생한 이유)를 저장합니다.
	
	//constructor
	public UpDownException() {
		super("범위를 넘었자나 멍청아~"); // 예외 메시지를 Exception에게 전달하면 됩니다.
		
	}

}
