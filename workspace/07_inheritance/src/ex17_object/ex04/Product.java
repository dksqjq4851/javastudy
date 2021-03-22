package ex17_object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
	
	//field

	private String model;
	private String manufacturer;
	private String date;
	@Override
	public boolean equals(Object obj) {
		if ( this == obj) {//p1.equals(p1)
			return true;
		}
		if(obj instanceof Product) { //p1.equals(p2)
			Product p = (Product)obj;
			//모델과 제조사를 ㅣ교해서  동일하면 true를 반환, 안미ㅕㄴ false반환
			//p1.equals(p2)인 경우
			//p1의 모델 : model(this.model)
			//p2의 모델 : p.model
			
			if(model.equals(p.model) && manufacturer.equals(p.manufacturer)) {
				return true;
			}else {
				return false;
			}
			
		}
		// TODO Auto-generated method stub
		return false;  //obj가 product가 아님
	}
	
	//method
	
	
	
	
	
}