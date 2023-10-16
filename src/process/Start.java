package process;

import java.util.Scanner;

import character.캐릭터;

public class Start {

	final static int NEW = 1;
	final static int LOAD = 2;
	final static int SAVE = 3;
	final static int EXIT = 4;


	public static void main(String[] args) {
		boolean continueFlag = true;
		CreateChar cc = new CreateChar();
		캐릭터 c = new 캐릭터();

		while(continueFlag == true) {
			System.out.println("*****텍스트 게임*****");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 새게임");
			System.out.println("2. 불러오기");
			System.out.println("3. 저장하기");
			System.out.println("4. 종료");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case NEW:
				System.out.println("새게임을 시작합니다.");
				c = cc.생성메뉴();
				break;
			case LOAD:
				System.out.println("게임을 불러옵니다.");
				불러오기 l = new 불러오기();
				c = l.불러오기메소드();
				System.out.println(c);
				break;
			case SAVE:
				System.out.println("게임을 저장합니다.");
				세이브 s = new 세이브();
				s.저장하기(c);
				break;
			case EXIT:
				System.out.println("게임을 종료합니다.");
				continueFlag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}




		}

	}

}
