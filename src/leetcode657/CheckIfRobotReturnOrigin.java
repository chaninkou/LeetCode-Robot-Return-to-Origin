package leetcode657;

public class CheckIfRobotReturnOrigin {
	// Add and subtract to check where is currently.
	  public boolean judgeCircle(String moves) {
	        int x = 0;
	        
	        int y = 0;
	        
	        for (char ch : moves.toCharArray()) {
	            if (ch == 'U'){
	                y++;
	            }
	            else if (ch == 'D'){
	                y--;
	            }
	            else if (ch == 'R'){
	                x++;
	            } 
	            else if (ch == 'L'){
	                x--;
	            }
	        }
	        
	        return x == 0 && y == 0;
	    }
	  
    public boolean judgeCircle2(String moves) {
        int x = 0;
        
        int y = 0;
        
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U': x++;
                    break;
                case 'D': x--;
                    break;
                case 'R': y++;
                    break;
                case 'L': y--;
                    break;
            }
        }
        
        return x == 0 && y == 0;
    }
}
