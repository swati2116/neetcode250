package arrayandhashing;

import java.util.HashSet;

public class ValidSudoku {
     
    public boolean isValidSudoku(char[][] board) {
    	 int n = 9;
    	 HashSet<Character>[] rows= new HashSet[n];
    	 HashSet<Character>[] cols= new HashSet[n];
    	 HashSet<Character>[] boxes= new HashSet[n];
         for(int i=0 ; i<n ; i++)
         {
        	 rows[i]= new HashSet();
        	 cols[i]= new HashSet();
        	 boxes[i]= new HashSet();
         }
         for(int r=0; r<board.length ; r++)
         {
        	 for(int c=0; c<board[0].length ; c++)
        	 {
        		 char cell= board[r][c];
        		 if(cell=='.')
        		 {
        			 continue;
        		 }
        		 if(rows[r].contains(cell))
        		 {
        			 return false;
        		 }
        		 rows[r].add(cell);
        		 if(cols[c].contains(cell))
        		 {
        			 return false;
        		 }
        		 cols[c].add(cell);
        		 int boxindex= 3*(r/3)+(c/3);
        		 if(boxes[boxindex].contains(cell))
        		 {
        			 return false;
        		 }
        		 boxes[boxindex].add(cell);
        	 }
         }
    	
    	return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidSudoku vs= new ValidSudoku();
		Boolean valid=vs.isValidSudoku(new char[][] {{'1','2','.','.','3','.','.','.','.'},
			{'4','.','.','5','.','.','.','.','.'},
			{'.','9','1','.','.','.','.','.','3'},
			{'5','.','.','.','6','.','.','.','4'},
			{'.','.','.','8','.','3','.','.','5'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','.','.','.','.','.','2','.','.'},
			{'.','.','.','4','1','9','.','.','8'},
			{'.','.','.','.','8','.','.','7','9'}});
		if(valid)
		{
			System.out.println("Valid sudoku");
		}
		else
		{
			System.out.println("InValid sudoku");
		}
		
	}

}
//*****************************************//
/*
 * Valid Sudoku Solved You are given a 9 x 9 Sudoku board board. A Sudoku board
 * is valid if the following rules are followed:
 * 
 * Each row must contain the digits 1-9 without duplicates. Each column must
 * contain the digits 1-9 without duplicates. Each of the nine 3 x 3 sub-boxes
 * of the grid must contain the digits 1-9 without duplicates. Return true if
 * the Sudoku board is valid, otherwise return false
 * 
 * Note: A board does not need to be full or be solvable to be valid.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: board = [["1","2",".",".","3",".",".",".","."],
 * ["4",".",".","5",".",".",".",".","."], [".","9","8",".",".",".",".",".","3"],
 * ["5",".",".",".","6",".",".",".","4"], [".",".",".","8",".","3",".",".","5"],
 * ["7",".",".",".","2",".",".",".","6"], [".",".",".",".",".",".","2",".","."],
 * [".",".",".","4","1","9",".",".","8"], [".",".",".",".","8",".",".","7","9"]]
 * 
 * Output: true Example 2:
 * 
 * Input: board = [["1","2",".",".","3",".",".",".","."],
 * ["4",".",".","5",".",".",".",".","."], [".","9","1",".",".",".",".",".","3"],
 * ["5",".",".",".","6",".",".",".","4"], [".",".",".","8",".","3",".",".","5"],
 * ["7",".",".",".","2",".",".",".","6"], [".",".",".",".",".",".","2",".","."],
 * [".",".",".","4","1","9",".",".","8"], [".",".",".",".","8",".",".","7","9"]]
 * 
 * Output: false Explanation: There are two 1's in the top-left 3x3 sub-box.
 */