package java_20190730;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// 자동 import : Ctrl + Shift + o(영문)
		// HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		// HashSet set = new HashSet();// 선언
		// TreeSet은 데이터(객체)의 중복을 허용하지 않고, 오름차순 정렬한다.
		TreeSet set = new TreeSet();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			// 할당, auto-boxing(primitive data type => wrapper)
			set.add(random);
			// HashSet 크기 : size()
			if (set.size() == 6)
				break;
		}
		// HashSet의 출력은 Iterator로 변경을 해서 출력해야 한다.
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {// hasNext() HashSet에 출력할 객체가 존재하는지 판단하는 메소드
			// auto-unboxing : wrapper => primitive data type
			int temp = i.next();// next() 해당 객체를 가져온다.
			System.out.print(temp + "\t");
		}
	}
}