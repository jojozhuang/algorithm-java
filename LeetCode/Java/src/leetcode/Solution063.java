/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Unique Paths II.
 * Follow up for "Unique Paths":
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * 
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * 
 * Note: m and n will be at most 100.
 * 
 * @author Johnny
 */
public class Solution063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        
        // Define function, f[i][j] is the count of possible path from start
        // point obstacleGrid[i][j], f[i][j] = f[i-1][j] + f[i][j-1];
        int[][] f = new int[obstacleGrid.length][obstacleGrid[0].length];
        // Initial
        boolean obs = false;
        for(int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                obs = true;
            }
            f[i][0] = obs ? 0 : 1;            
        }
        obs = false;
        for(int j = 0; j < obstacleGrid[0].length; j++) {
            if (obstacleGrid[0][j] == 1) {
                obs = true;
            }
            f[0][j] = obs ? 0 : 1;          
        }
        // Calculate f[i][j]
        for(int i = 1; i < obstacleGrid.length; i++) {
            for(int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    f[i][j] = 0;
                }
                else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }
        
        return f[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
