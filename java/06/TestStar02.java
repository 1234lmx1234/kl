public class TestStar02 {
	public static void main(String[] args) {
		int layer = 7;
		for(int i=1;i<=layer;i++) {
			//����ո�
			int spaces = layer-i;
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			//���*��
			int stars = 2*i-1;
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}