package pairmatching;

import pairmatching.domain.ClassType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCrewFile {

    private static List<String> crewNames = new ArrayList<>(); // 파일에서 로드한 크루 이름 목록
    private static String path = "src/main/resources/";

    public static List<String> readFile(ClassType classType) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path + classType.getFileName()));
            String str;
            while ((str = br.readLine()) != null) {
                crewNames.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return crewNames;
    }

}
