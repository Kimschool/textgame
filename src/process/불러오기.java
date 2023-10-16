package process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import character.캐릭터;

public class 불러오기 {

	public 캐릭터 불러오기메소드() {

		 // 읽을 파일의 경로 및 파일 이름을 지정합니다.
        String filePath = "C:\\bbb\\textgame\\src\\savadata\\savedata.txt"; // 원하는 경로와 파일 이름으로 변경하세요.
        캐릭터 c = new 캐릭터();

        try {
            // FileReader와 BufferedReader를 사용하여 파일을 읽어옵니다.
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> lineList = new ArrayList<String>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            	lineList.add(line);
            }

            c.setId(lineList.get(0));
            c.set직업(Integer.valueOf(lineList.get(1)));
            c.set레벨(Integer.valueOf(lineList.get(2)));


            // 파일을 닫습니다.
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("파일을 읽는 동안 오류가 발생했습니다: " + e.getMessage());
        }
        return c;

	}

}
