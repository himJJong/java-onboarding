package onboarding;

import java.util.*;

public class Problem6 {
    static List<String> email = new ArrayList<>();
    static List<String> nickname = new ArrayList<>();
    static HashSet<Integer> data = new HashSet<>();
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        checkForms(forms);
        findNickname(nickname);
        answer = findEmail();
        sortEmail(answer);
        return answer;
    }
    static void checkForms(List<List<String>> forms) {
        for (int i = 0; i < forms.size(); i++) {
            addData(forms.get(i));
        }
    }
    static void addData(List<String> data) {
    }
    static void findNickname(List<String> nickname) {
    }
    static void compareNickName(String nickname, int mypos){
    }
    static void checkEmailIndex(String substr, int mypos ) {
    }
    static List<String> findEmail() {
        List<String> result = new ArrayList<>();
        return result;
    }
    static void sortEmail(List<String> email){
    }
}

