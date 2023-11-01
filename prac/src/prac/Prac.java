package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Prac {

	    private static final int[][] pieces = {{1, 1}, {2, 2}, {4, 2}, {4, 4}};

	    public static void main(String[] args) throws IOException {
	   
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	String input = br.readLine();
	    	
	        int n = Integer.parseInt(input.split(" ")[0]);
	        int m = Integer.parseInt(input.split(" ")[1]);

	        boolean[][] board = new boolean[n][m];
	        long ways = countWays(board, 0, 0);
	        System.out.println(ways);
	    }

	    private static boolean canPlace(boolean[][] board, int x, int y, int[] piece) {
	        for (int i = 0; i < piece[0]; i++) {
	            for (int j = 0; j < piece[1]; j++) {
	                if (x + i >= board.length || y + j >= board[0].length || board[x + i][y + j]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private static void placePiece(boolean[][] board, int x, int y, int[] piece, boolean status) {
	        for (int i = 0; i < piece[0]; i++) {
	            for (int j = 0; j < piece[1]; j++) {
	                board[x + i][y + j] = status;
	            }
	        }
	    }

	    private static long countWays(boolean[][] board, int x, int y) {
	        if (y >= board[0].length) {
	            y = 0;
	            x++;
	        }
	        if (x >= board.length) {
	            return 1;
	        }
	        if (board[x][y]) {
	            return countWays(board, x, y + 1);
	        }

	        long ways = 0;
	        for (int[] piece : pieces) {
	            if (canPlace(board, x, y, piece)) {
	                placePiece(board, x, y, piece, true);
	                ways += countWays(board, x, y + 1);
	                placePiece(board, x, y, piece, false);
	            }
	        }
	        return ways;
	    }	
}