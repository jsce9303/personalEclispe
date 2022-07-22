package Pro5;

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new Television(false), new Radio(true) };
		
		for(Controller controller : c)
			controller.show();
	}

}
