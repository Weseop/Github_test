package UI_Pack;


//A = 클래스명_UI
//B = UI_클래스명


public class Basic_UI_Info {
	/****************************************
	 ****************************************/
	
	/*
	public A A_Info(Main_UI UI_Main) {
		// TODO Auto-generated method stub
		A B = new A_Info().get(UI_Main);
		return B;
	}
	 */
	
	/****************************************
	 ****************************************/
	
	public Ex_UI Ex_UI_Info(Main_UI UI_Main) {
		// TODO Auto-generated method stub
		Ex_UI UI_Ex = new Ex_UI_Info().get(UI_Main);
		return UI_Ex;
	}
}


/*
class A_Info {
private A B;

A get(Main_UI UI_main) {
	if (UI_main.User_Check == true)
		return B = new A _Manager(UI_main);
	else
		return B = new A _User(UI_main);
	}

}
*/


class Ex_UI_Info {
	private Ex_UI UI_Ex;

	Ex_UI get(Main_UI UI_Main) {
		if (UI_Main.User_Check == true)
			return UI_Ex = new Ex_UI_Manager(UI_Main);
		else
			return UI_Ex = new Ex_UI_User(UI_Main);
	}

}

//  A = 클래스명_UI
//  B = UI_클래스명
/*
class A_Info {
	private A B;

	A get(Main_UI UI_main) {
		if (UI_main.User_Check == true)
			return B = new A _Manager(UI_main);
		else
			return B = new A _User(UI_main);
	}

}
*/

