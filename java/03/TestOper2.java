public class TestOper2 {
	public static void main(String[] args) {
		//> >= <= !=
		//  10<a<20 ���ǲ��Ե� a>10&&a<20
		int a = 10;
		//�ж�a�Ƿ����10���������10��z��ֵ����10������z��ֵ����20
		int z = a>10?10:20;
		System.out.println(z+","+a);
		//����������ȼ�
		int c = (a++)-(z--);
	}
}