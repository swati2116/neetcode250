package graph;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// if grid contains water skip it
				if (grid[i][j] == 0) {
					continue;
				}
				// if land is in 1st row or the land previous upper cell is water than it is
				// perimeter
				if (i == 0 || grid[i - 1][j] == 0)
					count++;
				// if land is in last row or the land lower cell is water than it is perimeter
				if (i == rows - 1 || grid[i + 1][j] == 0)
					count++;
				// if land is in 1st col or the land previous cell is water than it is perimeter
				if (j == 0 || grid[i][j - 1] == 0)
					count++;
				// if land is in last col or the land next cell is water than it is perimeter
				if (j == cols - 1 || grid[i][j + 1] == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandPerimeter ip = new IslandPerimeter();
		ip.islandPerimeter(new int [] [] {{}});
	}

}

//-------------------------------------------------------------------------//

/*
 * Time & Space Complexity Time complexity: O ( m ∗ n ) O(m∗n) Space complexity:
 * O ( 1 ) O(1) extra space. Where m m is the number of rows and n n is the
 * 
 * number of columns in the grid.
 */
//-------------------------------------------------------------------------//

/*
 * You are given a row x col grid representing a map where grid[i][j] = 1
 * represents land and grid[i][j] = 0 represents water.
 * 
 * Grid cells are connected horizontally/vertically (not diagonally). The grid
 * is completely surrounded by water, and there is exactly one island (i.e., one
 * or more connected land cells).
 * 
 * The island doesn't have "lakes", meaning the water inside isn't connected to
 * the water around the island. One cell is a square with side length 1.
 * 
 * Return the perimeter of the island.
 */