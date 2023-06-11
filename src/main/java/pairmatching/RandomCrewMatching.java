package pairmatching;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomCrewMatching implements RandomCrewMatchingGenerate {

    @Override
    public List<String> shuffleCrew(List<String> crewNames) {
        return Randoms.shuffle(crewNames);
    }
}
