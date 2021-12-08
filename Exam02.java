import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();

		while (true) {
			System.out.println("[1]. 노래추가  [2].노래삭제  [3].노래검색  [4].종료");
			System.out.print("실행될 메뉴 입력 >> ");
			int n = sc.nextInt();
			System.out.println("=====list====");
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println((i + 1) + "." + arrayList.get(i));
			}
			System.out.println("=============");
			if (n == 1) {
				System.out.print("추가할 노래 제목 입력 >> ");
				String addsong = sc.next();
				arrayList.add(addsong);
				System.out.println("=====list====");
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println((i + 1) + "." + arrayList.get(i));
				}
				System.out.println("=============");
			} else if (n == 2) {
				System.out.print("삭제할 노래 번호 입력 >> ");
				int deletesong = sc.nextInt();
				arrayList.remove(deletesong - 1);
				System.out.println("=====list====");
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println((i + 1) + "." + arrayList.get(i));
				}
				System.out.println("=============");
			} else if (n == 3) {
				System.out.print("검색할 노래 제목 입력 >> ");
				String searchsong = sc.next();
				boolean chice = false;
				for (int i = 0; i < arrayList.size(); i++) {
					if (searchsong.equals(arrayList.get(i))) {
						System.out.println("검색한 노래는" + (i + 1) + "번째애 았습니다.");
						chice = true;
					}
				}
				if (chice == false) {
					System.out.println("검색한 노래가 없습니다.");
				}
			} else {
				System.out.println("종료...");
				break;
			}
		}
	}
}
