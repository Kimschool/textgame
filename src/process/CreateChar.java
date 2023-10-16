package process;

import java.util.Scanner;

import character.캐릭터;

public class CreateChar {

	final static int 전사 = 1;
	final static int 마법사 = 2;
	final static int 도적 = 3;

	public 캐릭터 생성메뉴() {

		캐릭터 c = new 캐릭터();
		System.out.println("캐릭터를 선택하세요");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		switch (input) {
		case 전사:
			System.out.println("전사를 선택하셨습니다.");
			CreateChar cc = new CreateChar();
			c = cc.캐릭터생성(전사);
			break;
		case 마법사:
			System.out.println("마법사를 선택하셨습니다.");
			break;
		case 도적:
			System.out.println("도적을 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

		return c;
	}

	public 캐릭터 캐릭터생성(int 클래스) {

		System.out.println("아이디를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		캐릭터 c = new 캐릭터();
		c.setId(input);
		c.set레벨(1);
		c.setHp(100);
		c.setMp(100);
		c.set소지금(0);
		c.set경험치(0);

		System.out.println(c);

		return c;
	}

}
