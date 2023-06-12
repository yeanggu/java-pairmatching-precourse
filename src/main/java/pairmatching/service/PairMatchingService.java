package pairmatching.service;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.view.MatchingView;


public class PairMatchingService {

    private MatchingView matchingView;

    public PairMatchingService() {
        this.matchingView = new MatchingView();
    }

    // 기능 선택하기
    public void inputSelectFunction() {
        matchingView.selectFunctionMessage();
        String input = Console.readLine();
        // TODO : input에 따른 기능 구현
    }



}
