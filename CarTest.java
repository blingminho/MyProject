package constructor;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();//1번째 생성자 호출
		
		System.out.println(c.num);
		System.out.println(c.color);
		
		Car c2 = new Car("pink");
		System.out.println(c2.color);
		
		Car c3 = new Car(4,"green");
		System.out.println(c3.num);
		System.out.println(c3.color);
	}

}
