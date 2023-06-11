package pairmatching;

import java.util.List;

@FunctionalInterface
public interface RandomCrewMatchingGenerate {

    List<String> shuffleCrew(List<String> crewNames);
}
