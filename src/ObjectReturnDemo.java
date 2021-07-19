
public class ObjectReturnDemo {

	int a;
	
	ObjectReturnDemo(int i){
		a = i;
	}
	
	ObjectReturnDemo incrByTen() {
		ObjectReturnDemo temp = new ObjectReturnDemo(a+10); 
		return temp;
	}
	
}
