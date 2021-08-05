package UI_Pack;

import Button_Pack.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

/*---------------------------------------------*/
/* UI자식클래스명 : 부모클래스명 + _유저정보 (앞은 대문자) */
/*---------------------------------------------*/
//자식 메소드에서 회원이 필요없을 경우 굳이 클래스로 구현할 필요 없음.

public abstract class Ex_UI extends Basic_UI {
	Main_UI UI_Main;
	List<JButton> Button_Setter = new ArrayList<JButton>();
	
	final int MainUI_Width = 500; // !!메인프레임 가로길이. 초기화 할것
	final int MainUI_Length = 500; // !!메인프레임 세로 길이. 초기화 할것
	
	String Title = "Ex"; // !!프레임 제목. 초기화 할것

	Ex_UI(Main_UI UI_Main) {
		//super(UI_Main);
		// TODO Auto-generated constructor stub
		this.UI_Main = UI_Main;
		Create();
	}

	private void Create() {
		setTitle(Title);
		setSize(MainUI_Width, MainUI_Length);
		super.Basic_Setting(); // UI_Basic의 기본 세팅

		/*/
		/* 부모와 자식UI가 버튼개수나 다른객체에 의해서 다르다면 둘 중 기능이 더 큰 UI를 기준으로 프레임 설계 이후 배치조절으로 해결할 것.
		/* 예를들어 UI_Main.User_Check를 이용하여 if문으로 배치를 구분 짓거나 ==> 1번 자식의 Button_Add()에 버튼을
		/* 다넣은 후 Button_Add()내부에 버튼세팅을 해도 ok ==> 2번
		/*/
		

		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이 프레임 꺼질 때 모든 프레임 종료.
	}

	abstract void Button_Add();
}

class Ex_UI_User extends Ex_UI {

	Ex_UI_User(Main_UI UI_Main) { // 메인UI받아올때
		super(UI_Main);
		// super.Title = ""; //자식 UI 마다 이름을 다르게 할거면 주석해제 후 초기화
		Button_Add();
	}

	@Override
	protected void Button_Add() {
		// TODO Auto-generated method stub

		// 여기부터 차례대로 하나씩 기능 넣을 것
		super.Button_Setter.add(new EX_Button(super.UI_Main)); //현재 클래스가 EX_UI 클래스가 아니라면 주석처리바람.

	}

}

class Ex_UI_Manager extends Ex_UI {

	Ex_UI_Manager(Main_UI UI_Main) { // 메인UI받아올때
		super(UI_Main);
		// super.Title = ""; //자식 UI 마다 이름을 다르게 할거면 주석해제 후 초기화
		Button_Add();
	}

	@Override
	protected void Button_Add() {
		// TODO Auto-generated method stub

		// 여기부터 차례대로 하나씩 기능 넣을 것
		super.Button_Setter.add(new EX_Button(super.UI_Main)); //현재 클래스가 EX_UI 클래스가 아니라면 주석처리바람.
	}
}
