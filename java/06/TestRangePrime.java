public class TestRangePrime {
	public static void main(String[] args) {
		//���2-150֮�����������
		for(int i=2;i<150;i++) {
			//�ж�i�Ƿ�������
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
}