package sec07;

class PRMember{
	enum MemberColor {
		RED,BLUE,YELLOW,BLACK,PINK
	}
	
	final MemberColor getLeaerColor() {
		return MemberColor.RED;
	}
}

class ClassChange extends PRMember {
	//MemberColor getLeaerColor() {}
}
public class PowerRanger {
	public static void main(String[] args) {
		ClassChange w = new ClassChange();
		w.getLeaerColor();
	}
}
