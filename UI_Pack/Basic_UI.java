package UI_Pack;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Basic_UI extends JFrame {
	Basic_UI() { // 메인UI받아올때
		Basic_Setting();
	}

	protected void Basic_Setting() {
		setLocationRelativeTo(null); // 윈도우 가운데 만듬
		setLayout(null); // 절대레이아웃
		setResizable(false);// 크기변경불가
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((res.width - this.getSize().width) / 2, (res.height - this.getSize().height) / 2);
	}

}
