package UI_Pack;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Basic_UI extends JFrame {
	Basic_UI() { // ����UI�޾ƿö�
		Basic_Setting();
	}

	protected void Basic_Setting() {
		setLocationRelativeTo(null); // ������ ��� ����
		setLayout(null); // ���뷹�̾ƿ�
		setResizable(false);// ũ�⺯��Ұ�
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((res.width - this.getSize().width) / 2, (res.height - this.getSize().height) / 2);
	}

}
