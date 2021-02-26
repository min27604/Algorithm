package Programmers.LVL_1;

// String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
// seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

public class P12919 {
    public String solution(String[] seoul) {
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i; // 여기서 바로 리턴하면 효율이 좀 더 좋아진다.
            }
        }

        return "김서방은 " + index + "에 있다";
    }
}
