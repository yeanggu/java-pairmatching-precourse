package pairmatching;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomMemberMatching implements RandomMemberMatchingGenerate {

    @Override
    public List<String> shuffleMember(List<String> crewNames) {
        return Randoms.shuffle(crewNames);
    }
}
