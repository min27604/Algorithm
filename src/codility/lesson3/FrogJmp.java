package codility.lesson3;

public class FrogJmp {
	public static int solution(int X, int Y, int D) {
		int toJump = Y - X;
		if (toJump % D == 0) {
			return toJump / D;
		}
		return toJump / D + 1;
	}
}
