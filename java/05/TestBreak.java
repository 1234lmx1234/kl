public class TestBreak {
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%5==0) {
				break;//��������ѭ��
			}
			System.out.println(i);
		}
	}
}