package Pro9;

class Hotel{
	
	class Room{
		int i;
		String name;
		Room(int i,String name){
			this.i=i;
			this.name=name;
		}
	}
	Room[] room = new Room[9];
	
	public void add(int i, String name) {
		room[i] = new Room(i,name);
	}
	void show() {
		for(Room r : room)
			if(r != null)
				System.out.println(r.i+"번 방을 " + r.name + "(이)가 예약했습니다.");
	}
}


public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5,"호돌이");
		hotel.add(7,"길동이");
		hotel.show();
	}
}
