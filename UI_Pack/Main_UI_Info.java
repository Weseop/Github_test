package UI_Pack;

public class Main_UI_Info {
	private Main_UI UI_Main;

	// private 데이터베이스 DBMS = new Main_UI용_데이터베이스처리자();
	//
	public Main_UI_Info(/* 데이터베이스 객체 */) {
		UI_Main = Create(); // UI분별
		
		//데이터베이스 객체 변수단위로 추출하는 '메소드(UI,데이터베이스 객체)'
		//메소드는 UI.Data_set(저장할 데이터 나열) 을 통해 데이터 저장.
		
		UI_Main.Create(); // UI구현
	}

	public Main_UI Create() {
		// 데이터베이스 처리해서 결과값 가져오는 클래스 추가

		if (true) { // 데이터베이스.get_유저정보로 판별
			return new Main_UI_Manager();
		} else {
			return new Main_UI_User();
		}

		// 데이터베이스 클래스 get 메소드
		// 이후 필요한 정보 추가. 여기에 추가시 Main_UI클래스에도 추가할것
	}
}