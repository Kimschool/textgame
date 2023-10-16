package process;

import java.io.FileWriter;
import java.io.IOException;

import character.캐릭터;

public class 세이브 {

	public void 저장하기(캐릭터 status) {

		// 파일을 저장할 경로와 파일 이름을 지정합니다.
        String filePath = "C:\\bbb\\textgame\\src\\savadata\\savedata.txt"; // 원하는 경로와 파일 이름으로 변경하세요.

        try {
            // FileWriter를 사용하여 파일을 생성하고 데이터를 씁니다.
            FileWriter writer = new FileWriter(filePath);
            String 아이디 = status.getId();
            int 직업 = status.get직업();
            int 레벨 = status.get레벨();
            int HP = status.getHp();
            int MP = status.getMp();
            int 소지금 = status.get소지금();
            int 경험치 = status.get경험치();

            writer.write(아이디 + "\n" + 직업 + "\n" + 레벨 + "\n" + HP + "\n" + MP + "\n" +  소지금 + "\n" + 경험치);
            writer.close();

            System.out.println("파일이 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("파일을 저장하는 동안 오류가 발생했습니다: " + e.getMessage());
        }

	}

}
