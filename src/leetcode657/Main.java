package leetcode657;

public class Main {
	public static void main(String[] args) {
		String moves = "UDUDUDRLRLRL";
		
		System.out.println("Moves: " + moves);
		
		CheckIfRobotReturnOrigin solution = new CheckIfRobotReturnOrigin();
		
		System.out.println("Solution: " + solution.judgeCircle(moves));
	}
}
