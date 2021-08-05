package UI_Pack;

import Button_Pack.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

/*---------------------------------------------*/
/* UI�ڽ�Ŭ������ : �θ�Ŭ������ + _�������� (���� �빮��) */
/*---------------------------------------------*/
//�ڽ� �޼ҵ忡�� ȸ���� �ʿ���� ��� ���� Ŭ������ ������ �ʿ� ����.

public abstract class Ex_UI extends Basic_UI {
	Main_UI UI_Main;
	List<JButton> Button_Setter = new ArrayList<JButton>();
	
	final int MainUI_Width = 500; // !!���������� ���α���. �ʱ�ȭ �Ұ�
	final int MainUI_Length = 500; // !!���������� ���� ����. �ʱ�ȭ �Ұ�
	
	String Title = "Ex"; // !!������ ����. �ʱ�ȭ �Ұ�

	Ex_UI(Main_UI UI_Main) {
		//super(UI_Main);
		// TODO Auto-generated constructor stub
		this.UI_Main = UI_Main;
		Create();
	}

	private void Create() {
		setTitle(Title);
		setSize(MainUI_Width, MainUI_Length);
		super.Basic_Setting(); // UI_Basic�� �⺻ ����

		/*/
		/* �θ�� �ڽ�UI�� ��ư������ �ٸ���ü�� ���ؼ� �ٸ��ٸ� �� �� ����� �� ū UI�� �������� ������ ���� ���� ��ġ�������� �ذ��� ��.
		/* ������� UI_Main.User_Check�� �̿��Ͽ� if������ ��ġ�� ���� ���ų� ==> 1�� �ڽ��� Button_Add()�� ��ư��
		/* �ٳ��� �� Button_Add()���ο� ��ư������ �ص� ok ==> 2��
		/*/
		

		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�� ������ ���� �� ��� ������ ����.
	}

	abstract void Button_Add();
}

class Ex_UI_User extends Ex_UI {

	Ex_UI_User(Main_UI UI_Main) { // ����UI�޾ƿö�
		super(UI_Main);
		// super.Title = ""; //�ڽ� UI ���� �̸��� �ٸ��� �ҰŸ� �ּ����� �� �ʱ�ȭ
		Button_Add();
	}

	@Override
	protected void Button_Add() {
		// TODO Auto-generated method stub

		// ������� ���ʴ�� �ϳ��� ��� ���� ��
		super.Button_Setter.add(new EX_Button(super.UI_Main)); //���� Ŭ������ EX_UI Ŭ������ �ƴ϶�� �ּ�ó���ٶ�.

	}

}

class Ex_UI_Manager extends Ex_UI {

	Ex_UI_Manager(Main_UI UI_Main) { // ����UI�޾ƿö�
		super(UI_Main);
		// super.Title = ""; //�ڽ� UI ���� �̸��� �ٸ��� �ҰŸ� �ּ����� �� �ʱ�ȭ
		Button_Add();
	}

	@Override
	protected void Button_Add() {
		// TODO Auto-generated method stub

		// ������� ���ʴ�� �ϳ��� ��� ���� ��
		super.Button_Setter.add(new EX_Button(super.UI_Main)); //���� Ŭ������ EX_UI Ŭ������ �ƴ϶�� �ּ�ó���ٶ�.
	}
}
