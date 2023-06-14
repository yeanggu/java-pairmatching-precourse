package pairmatching.service;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.ReadCrewFile;
import pairmatching.domain.ClassType;
import pairmatching.view.MatchingView;

import java.util.List;

public class PairMatchingService {

    private MatchingView matchingView;
    private ReadCrewFile readCrewFile;
    List<String> crewNames; // 파일에서 로드한 크루 이름 목록

    public PairMatchingService() {
        this.readCrewFile = new ReadCrewFile();
        this.matchingView = new MatchingView();
    }

    // 기능 선택하기
    public void inputSelectFunction() {
        matchingView.selectFunctionMessage();
        String input = Console.readLine();
        // TODO : input에 따른 기능 구현
    }

    // 과정 및 미션 정보
    public void missionInformation() {
        matchingView.classAndMissionInformation();
        selectOption();
    }

    // 과정 및 미션 입력하기
    public void selectOption() {
        matchingView.selectOption();
        String input = Console.readLine();
        // TODO : input에 따른 기능 구현
    }

    // 파일 읽는 기능
    public void readCrewFile() {
        crewNames = readCrewFile.readFile(ClassType.BACK_END);
        // TODO : 매개변수 동적으로 코드 작성 필요
    }



}
