package UI_Pack;

public class Main_UI_Info {
	private Main_UI UI_Main;

	// private �����ͺ��̽� DBMS = new Main_UI��_�����ͺ��̽�ó����();
	//
	public Main_UI_Info(/* �����ͺ��̽� ��ü */) {
		UI_Main = Create(); // UI�к�
		
		//�����ͺ��̽� ��ü ���������� �����ϴ� '�޼ҵ�(UI,�����ͺ��̽� ��ü)'
		//�޼ҵ�� UI.Data_set(������ ������ ����) �� ���� ������ ����.
		
		UI_Main.Create(); // UI����
	}

	public Main_UI Create() {
		// �����ͺ��̽� ó���ؼ� ����� �������� Ŭ���� �߰�

		if (true) { // �����ͺ��̽�.get_���������� �Ǻ�
			return new Main_UI_Manager();
		} else {
			return new Main_UI_User();
		}

		// �����ͺ��̽� Ŭ���� get �޼ҵ�
		// ���� �ʿ��� ���� �߰�. ���⿡ �߰��� Main_UIŬ�������� �߰��Ұ�
	}
}