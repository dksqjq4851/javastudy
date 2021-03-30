package ex03_join;

public class Calculator extends Thread{

	private int from;
	private int to;
	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	int result;
	
	public void addition() {
		//from부터 to 까지 모든 정수 더해서 result에 저장
		if(from>to) {
			int temp = from;
			from = to;
			to = temp;
		}
		for(int n = from; n <= to; n++) {
			result +=n;
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
