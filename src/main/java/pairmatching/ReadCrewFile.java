package pairmatching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCrewFile {

    private static List<String> crewNames = new ArrayList<>(); // 파일에서 로드한 크루 이름 목록
    private static String path = "src/main/resources/";

    public static List<String> readFile() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path + "backend-crew.md"));
            while (br.readLine() != null) {
                crewNames.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return crewNames;
    }

}
