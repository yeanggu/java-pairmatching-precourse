package pairmatching;

import java.util.List;

@FunctionalInterface
public interface RandomMemberMatchingGenerate {

    List<String> shuffleMember(List<String> crewNames);
}
