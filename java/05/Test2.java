//���1-100֮���ܹ�ͬʱ��3��4��������
public class Test2 {
	public static void main(String[] args) {
		int n = 1;
		while(n<=100) {
			if(n%3==0&&n%4==0) {
				System.out.println(n);
			}
			n++;
		}
	}
}