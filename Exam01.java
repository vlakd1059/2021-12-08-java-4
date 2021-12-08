import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList
		int[] arr = new int[5];
		// ArrayList 선언방법
		// Arraylisy<타입> 이름= new ArrayList<타입>();
		ArrayList<String> arrayList = new ArrayList<String>();

		// 값 추가 변수명.add("들어갈 값");
		arrayList.add("승환");
		arrayList.add("병관");
		arrayList.add("수민");

		// 원하는 위치에 값 추가 -> 삽입
		arrayList.add(1, "건하");
		arrayList.add(2, "건하2");

		// 원하는 위치에 값 삭제 -> remove("인덱스")
		arrayList.remove(2); // 2->> 주소값
		arrayList.remove(arrayList.size() - 1);

		// arrayList 출력
		// arrayList의 크기-> 변수명.size()
		for (int i = 0; i < arrayList.size(); i++) {
			// arrayList 값 가져오기-> 변수명.get(index)
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.get(1));
		// arrayList에 있는 1번째 주소를 불러오기

	}
}
