public class TestSwitch {
	public static void main(String[] args) {
		char level = 'B';
		//switch����ı�����������������char��ʵҲ��һ������
		//switch caseֻ�ܱȽϵ���
		switch (level) {
			case 'A':
				System.out.println("���úܺ�!");
				break;
			case 'B':
				System.out.println("���ò���");
				break;
			case 'C':
				System.out.println("�պü���!");
				break;
			case 'D':
				System.out.println("��Ҫ��Ŭ��!");
				break;
			default:
				System.out.println("ѧϰ���ù�!");
				break;
		}
	}
}