import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList
		int[] arr = new int[5];
		// ArrayList ������
		// Arraylisy<Ÿ��> �̸�= new ArrayList<Ÿ��>();
		ArrayList<String> arrayList = new ArrayList<String>();

		// �� �߰� ������.add("�� ��");
		arrayList.add("��ȯ");
		arrayList.add("����");
		arrayList.add("����");

		// ���ϴ� ��ġ�� �� �߰� -> ����
		arrayList.add(1, "����");
		arrayList.add(2, "����2");

		// ���ϴ� ��ġ�� �� ���� -> remove("�ε���")
		arrayList.remove(2); // 2->> �ּҰ�
		arrayList.remove(arrayList.size() - 1);

		// arrayList ���
		// arrayList�� ũ��-> ������.size()
		for (int i = 0; i < arrayList.size(); i++) {
			// arrayList �� ��������-> ������.get(index)
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.get(1));
		// arrayList�� �ִ� 1��° �ּҸ� �ҷ�����

	}
}
