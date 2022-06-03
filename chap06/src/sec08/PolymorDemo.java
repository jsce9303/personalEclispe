package sec08;

class SportsCar extends Car {
	void whoami() {
		System.out.println("나는 스포츠 자동차이다.");
	}
}

public class PolymorDemo {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];			//원소 2개를 가진 배열
		vehicles[0] = new Car();									// 첫번째 원소는 Car타입
		vehicles[1] = new SportsCar();						// 두번째 원소는 SportsCar 타입
		
		for (Vehicle v : vehicles)  //  for( int i = 0; i<vehicles.length; i++)
			v.whoami();						// 모든 원소(vehicles[0], vehicles[1])를 나열한다.
	}	

}
