public class TestContinue {
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%5==0) {
				continue;//��������ѭ����ֱ�ӽ��������ж�
			}
			System.out.println(i);
		}
	}
}