package Project;

import java.util.ArrayList;
import java.util.Scanner;

class Food {
	private String food;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	public void print() {
		System.out.println(food);
	}
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Food> fd = new ArrayList<Food>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.식당 입력");
			System.out.println("2.식당 조회");
			System.out.println("3.식당 수정");
			System.out.println("4.식당 뽑기");
			int ch;
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				int i;
				String menu;
				System.out.println("1.메뉴 추가");
				System.out.println("2.종료");
				i = sc.nextInt();
				if (i == 1) {
					System.out.print("원하시는 메뉴를 적어주세요 :");
					menu = sc.next();
					Food iF = new Food();
					iF.setFood(menu);
					fd.add(iF);
				} else {
					System.out.println("종료합니다");
				}
				break;
			case 2:
				for (int j = 0; j < fd.size(); j++) {
					System.out.println((j + 1) + "번째 식당 : " + fd.get(j).getFood());
				}
				break;
			case 3:
				break;
			case 4:
				fd.get((int) (Math.random()*fd.size())).print();
				
				break;
			}
		}

	}
}
