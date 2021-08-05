package UI_Pack;

import Button_Pack.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Main_UI extends JFrame { // ���ø��� �̿��Ͽ� ���� ��ɰ� �ٸ� ����� ����

    private final int MainUI_Width = 300; // ������ ���α���
    private int MainUI_Text_Length = 150;// �г� ������ ������ ����� UI �κ�
    private final int Panel_Width = 150; // �г� ���α���. ��ư�� ���α����̱⵵ ��.
    private int Panel_Length = 0; // ��ư�� �߰��� ���
    private final int Button_Length = 30; // ��ư ���� ����
    private final int Button_Distance = 20; // ��ư ��ġ ����

    List<JButton> Button_Setter = new ArrayList<JButton>();

    /**
     * *****************************
     * �����ͺ��̽� �ʱ�ȭ �� �κ� *
	 ******************************
     */
    public boolean User_Check = true; //�׽�Ʈ �Ҷ� ȸ�� => false �Ŵ��� => true
    public boolean OnlinePT;
    public String Title;

    //get
    //set
    // ���θ޼ҵ忡�� UI�� ������ �޼ҵ�
    public void Create() {
        // UI����
        // ���� UI �г�, ��ư �߰� �� ����
        JPanel panel = new JPanel();
        panel.setLayout(null);

        //System.out.println(String.format("%d", Button_Setter.size()));
        for (int i = 0; i < Button_Setter.size(); i++) {
            panel.add(Button_Setter.get(i));
            Button_Setter.get(i).setSize(Panel_Width, Button_Length);
            Button_Setter.get(i).setLocation(0, Panel_Length);
            Panel_Length += (Button_Setter.get(i).getHeight() + Button_Distance);
        }
        Panel_Length += Button_Distance;
        panel.setLocation((MainUI_Width - Panel_Width) / 2, MainUI_Text_Length);
        panel.setSize(Panel_Width, Panel_Length);
        add(panel);

        // ���� UI ������
        setTitle(Title);
        setLayout(null); // ���뷹�̾ƿ�
        setResizable(false);// ũ�⺯��Ұ�
        MainUI_Text_Length += (Panel_Length + Button_Distance);
        setSize(MainUI_Width, MainUI_Text_Length);
        Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((res.width - MainUI_Width) / 2, (res.height - MainUI_Text_Length) / 2); // ������ ��� ����

        // ���� UI �����ӿ� ���� ����
        JLabel Menu = new JLabel("MENU");
        Menu.setBounds(MainUI_Width / 6 + 12, (MainUI_Text_Length - Panel_Length) / 3, MainUI_Width / 6 * 4,
                (MainUI_Text_Length - Panel_Length) / 3);
        Menu.setFont(new Font("Arial", Font.PLAIN, MainUI_Width / 5));
        add(Menu);

        //�⺻
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected abstract void Button_Add();
}

//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
class Main_UI_User extends Main_UI {

    Main_UI_User() {
        Button_Add();
    }

    @Override
    protected void Button_Add() {
        // TODO Auto-generated method stub
        super.Title = "User_Mode";
        // ������� ���ʴ�� �ϳ��� ��� ���� ��

        super.Button_Setter.add(new EX_Button(this)); //�׽�Ʈ�� �޼ҵ�. Main_UI�� �ǻ�� ��ư�� �ֱ� ������ �� �ּ�ó�� �ٶ�.

        // �α׾ƿ� ��ư �߰�
    }

}

class Main_UI_Manager extends Main_UI {

    Main_UI_Manager() {
        Button_Add();
    }

    @Override
    protected void Button_Add() {
        // TODO Auto-generated method stub
        super.Title = "Manager_Mode";
        // ������� ���ʴ�� �ϳ��� ��� ���� ��

        //JButton A = new JButton("A");
        //JButton B = new JButton("B");
        //JButton C = new JButton("C");
        //super.Button_Setter.add(A);
        //super.Button_Setter.add(B);
        //super.Button_Setter.add(C);
        super.Button_Setter.add(new EX_Button(this)); //�׽�Ʈ�� �޼ҵ�. Main_UI�� �ǻ�� ��ư�� �ֱ� ������ �� �ּ�ó�� �ٶ�.
        super.Button_Setter.add(new EX_Button(this));
        super.Button_Setter.add(new EX_Button(this));
        // �α׾ƿ� ��ư �߰�
    }

}
