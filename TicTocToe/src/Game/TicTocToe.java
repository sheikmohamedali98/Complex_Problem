package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTocToe {
	static char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
			                      { '-', '+', '-', '+', '-' },
			                      { ' ', '|', ' ', '|', ' ' },
			                      { '-', '+', '-', '+', '-' }, 
			                      { ' ', '|', ' ', '|', ' ' } };

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> playerPos = new  ArrayList<Integer>();
	static ArrayList<Integer> cpuPos = new  ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGameBoard(gameBoard);
		while (true) {
			System.out.println("Enter the Postion");
			int playerPosition = scan.nextInt();
			while(playerPos.contains(playerPosition)|| cpuPos.contains(playerPosition)) {
				System.out.println("Position Taken! Enter The Correct Position");
				System.out.println("Enter the Postion");

				playerPosition = scan.nextInt();
			}
			placePiece(gameBoard, playerPosition, "player");
			String result = checkWinner();

			Random random = new Random();
			int cpuPosition = random.nextInt(9) + 1;
			while(playerPos.contains(cpuPosition)|| cpuPos.contains(cpuPosition)) {
				cpuPosition = random.nextInt(9) + 1;
			}
			placePiece(gameBoard, cpuPosition, "cpu");

			printGameBoard(gameBoard);
		   result = checkWinner();
			if(result.length()>0) {
				System.out.println(result);
                 break;
			}
		}

	}

	public static void printGameBoard(char[][] board) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void placePiece(char[][] board, int position, String player) {
		char symbol = ' ';
		if (player.equals("player")) {
			symbol = 'X';
			playerPos.add(position);
		} else if (player.equals("cpu")) {
			symbol = 'O';
			cpuPos.add(position);
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;

		}
	}

	@SuppressWarnings("rawtypes")
	public static String checkWinner() {
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);
		
		 List<List> winner = new  ArrayList<List>();
		 winner.add(topRow);
		 winner.add(midRow);
		 winner.add(botRow);
		 winner.add(leftCol);
		 winner.add(midCol);
		 winner.add(rightCol);
		 winner.add(cross1);
		 winner.add(cross2);

		 for(List list: winner) {
			 if(playerPos.containsAll(list)) {
				 return " Congrajulation You Won";
			 }else if(cpuPos.containsAll(list)) {
				 return "Computer win! better Luck Next Time :(";
			 }else if(playerPos.size()+cpuPos.size() == 9){
				 return "oops Math Draw";
			 }
		 }

		return "";
	}
}
