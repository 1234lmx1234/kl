public class TestNoddle {
	public static void main(String[] args) {
		System.out.println("---------��ͣ���һ����--------");
		makeNoddle("");
		System.out.println("----------��ͣ�׼����һ����--------");
		makeNoddle("ţ��");
		System.out.println("----------��ͣ�����Ҫ��һ����--------");
		makeNoddle("С����");
	}

	public static void makeNoddle(String addon) {
		System.out.println("��ˮ");
		System.out.println("����");
		System.out.println("����");
		if(addon!="") {
			System.out.println("�ӵ�"+addon);
		}
		System.out.println("����");
		System.out.println("һ�����������������!");
	}
}