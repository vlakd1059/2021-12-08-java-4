import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();

		while (true) {
			System.out.println("[1]. �뷡�߰�  [2].�뷡����  [3].�뷡�˻�  [4].����");
			System.out.print("����� �޴� �Է� >> ");
			int n = sc.nextInt();
			System.out.println("=====list====");
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println((i + 1) + "." + arrayList.get(i));
			}
			System.out.println("=============");
			if (n == 1) {
				System.out.print("�߰��� �뷡 ���� �Է� >> ");
				String addsong = sc.next();
				arrayList.add(addsong);
				System.out.println("=====list====");
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println((i + 1) + "." + arrayList.get(i));
				}
				System.out.println("=============");
			} else if (n == 2) {
				System.out.print("������ �뷡 ��ȣ �Է� >> ");
				int deletesong = sc.nextInt();
				arrayList.remove(deletesong - 1);
				System.out.println("=====list====");
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println((i + 1) + "." + arrayList.get(i));
				}
				System.out.println("=============");
			} else if (n == 3) {
				System.out.print("�˻��� �뷡 ���� �Է� >> ");
				String searchsong = sc.next();
				boolean chice = false;
				for (int i = 0; i < arrayList.size(); i++) {
					if (searchsong.equals(arrayList.get(i))) {
						System.out.println("�˻��� �뷡��" + (i + 1) + "��°�� �ҽ��ϴ�.");
						chice = true;
					}
				}
				if (chice == false) {
					System.out.println("�˻��� �뷡�� �����ϴ�.");
				}
			} else {
				System.out.println("����...");
				break;
			}
		}
	}
}
