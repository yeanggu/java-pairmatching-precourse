package pairmatching.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum LevelType {
    LEVEL_ONE("레벨1", Arrays.asList(MissionType.RACING_CAR, MissionType.LOTTO, MissionType.BASEBALL_NUMBER_GAME)),
    LEVEL_TWO("레벨2", Arrays.asList(MissionType.SHOPPING_BASKET, MissionType.PAYMENT, MissionType.SUBWAY_MAP)),
    LEVEL_THREE("레벨3", Collections.EMPTY_LIST),
    LEVEL_FOUR("레벨4", Arrays.asList(MissionType.PERFORMANCE_IMPROVEMENT, MissionType.DISTRIBUTION)),
    LEVEL_FIVE("레벨5", Collections.EMPTY_LIST);

    private final String levelName;
    private final List<MissionType> missionList;

    LevelType(String levelName, List<MissionType> gameList) {
        this.levelName = levelName;
        this.missionList = gameList;
    }

    public String getLevelName() {
        return levelName;
    }

    public List<String> getMissionList() {
        List<String> list = new ArrayList<>();
        for (MissionType type : missionList) {
            list.add(type.getTitle());
        }
        return list;
    }
}
