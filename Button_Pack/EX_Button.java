package Button_Pack;

import UI_Pack.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//버튼명은 버튼명_사용될UI_Button

public class EX_Button extends JButton {

	protected String name = "HI"; // 버튼 이름. 초기화 할 것
	
	protected boolean User_checker = false;
	protected Main_UI UI_Main;

	public EX_Button(Main_UI UI_Main) { // User_checker는 UI클래스에서 super.UI_main
		// TODO Auto-generated constructor stub
		this.UI_Main = UI_Main;
		this.User_checker = UI_Main.User_Check;
		/***********************************************
		 *  기본이름이 아닌 새로운 이름으로 정하고 싶을 시 주석해제  *
		 ***********************************************/
		// if(User_checker == true) { name = "Manager"; } //매니저
		// else if(User_checker == false) {name = "User"; }//회원
		setText(name);

		addActionListener(new MyActionListener());
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(name + "버튼 작동 확인");

			// User_checker = false; 관리자 회원 상관없이 설정할 때 주석 해제
			if (User_checker == true) {
				// 트레이너 이벤트
				new Basic_UI_Info().Ex_UI_Info(UI_Main); //현재 클래스가 EX_Button 클래스가 아니라면 주석처리바람.

				return;
			} else if (User_checker == false) {
				// 회원 이벤트
				new Basic_UI_Info().Ex_UI_Info(UI_Main); //현재 클래스가 EX_Button 클래스가 아니라면 주석처리바람.
				return;
			}

		}
	}

}
