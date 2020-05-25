/* *****************************************************************************
 *  Name: Joseph Worsfold
 *  Date: 25/05/2020
 *  Description: Algoriths Part 1 - src.Percolation Problem
 **************************************************************************** */

import edu.princeton.cs.algs4.QuickFindUF;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {

    public int gridSize;
    public int[][] grid;
    public WeightedQuickUnionUF qu;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        this.gridSize = n;
        this.grid = new int[n][n];
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        grid[row][col] = 1;
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col] == 1;
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }

    // number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    public static void main(String[] args) {
        Percolation p = new Percolation(5);
        p.open(0, 0);
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(p.grid[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("isOpen(0, 0) ? : " + p.isOpen(0,0));
    }
}
