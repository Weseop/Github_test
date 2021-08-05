package Button_Pack;

import UI_Pack.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//��ư���� ��ư��_����UI_Button

public class EX_Button extends JButton {

	protected String name = "HI"; // ��ư �̸�. �ʱ�ȭ �� ��
	
	protected boolean User_checker = false;
	protected Main_UI UI_Main;

	public EX_Button(Main_UI UI_Main) { // User_checker�� UIŬ�������� super.UI_main
		// TODO Auto-generated constructor stub
		this.UI_Main = UI_Main;
		this.User_checker = UI_Main.User_Check;
		/***********************************************
		 *  �⺻�̸��� �ƴ� ���ο� �̸����� ���ϰ� ���� �� �ּ�����  *
		 ***********************************************/
		// if(User_checker == true) { name = "Manager"; } //�Ŵ���
		// else if(User_checker == false) {name = "User"; }//ȸ��
		setText(name);

		addActionListener(new MyActionListener());
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(name + "��ư �۵� Ȯ��");

			// User_checker = false; ������ ȸ�� ������� ������ �� �ּ� ����
			if (User_checker == true) {
				// Ʈ���̳� �̺�Ʈ
				new Basic_UI_Info().Ex_UI_Info(UI_Main); //���� Ŭ������ EX_Button Ŭ������ �ƴ϶�� �ּ�ó���ٶ�.

				return;
			} else if (User_checker == false) {
				// ȸ�� �̺�Ʈ
				new Basic_UI_Info().Ex_UI_Info(UI_Main); //���� Ŭ������ EX_Button Ŭ������ �ƴ϶�� �ּ�ó���ٶ�.
				return;
			}

		}
	}

}
