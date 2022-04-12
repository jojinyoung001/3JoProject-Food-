package Project;
import java.util.ArrayList;
import java.util.Scanner;

class Food{
	private String food;
	public String getFood() {return food;}
	public void setFood(String food) {this.food = food;}
}

public class Main {
public static void main(String[] args) {
	ArrayList<Food> fd = new ArrayList<Food>();
	
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("1.식당 입력");
		System.out.println("2.식당 조회");
		System.out.println("3.식당 수정");
		System.out.println("4.식당 뽑기");
		int ch;
		ch = sc.nextInt();
		switch(ch) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
	
}
}
