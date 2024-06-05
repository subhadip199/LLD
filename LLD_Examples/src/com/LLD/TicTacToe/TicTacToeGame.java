package com.LLD.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;
	
	public TicTacToeGame() {
		initializeGame();
	}
	
	public void initializeGame() {
		//creating 2 Players
		players= new LinkedList<>();
		PlayingPieceX crossPiece= new PlayingPieceX();
		Player player1= new Player("Player1", crossPiece);
		
		PlayingPieceO noughtsPiece= new PlayingPieceO();
		Player player2= new Player("Player2", noughtsPiece);
		
		players.add(player1);
		players.add(player2);
		
		//initializeBoard
		gameBoard= new Board(3);
	}
	public String startGame()
	{
		boolean noWinner= true;
		while(noWinner)
		{
			//take out the player whose turn is and also put the player in the list back
			Player playerTurn= players.removeFirst();
			
			//get the free space from the board
			gameBoard.printBoard();
			
			if(!gameBoard.isFreeCellsExists())
			{
				noWinner=false;
				continue;
			}
			System.out.println("Players: "+ playerTurn.name+" Enter row, column: ");
			Scanner inputScanner= new Scanner(System.in);
			String s= inputScanner.nextLine();
			String[] values=s.split(",");
			int inputrow= Integer.valueOf(values[0]);
			int inputcolumn= Integer.valueOf(values[1]);
			
			boolean pieceAddedSuccessfully= gameBoard.addpiece(inputrow, inputcolumn,playerTurn.playingPiece);
			if(!pieceAddedSuccessfully)
			{
				System.out.println("Incorrect position chosen, try again");
				players.addFirst(playerTurn);
				continue;
			}
			players.addLast(playerTurn);
			boolean winner= isThereWinner(inputrow, inputcolumn, playerTurn.playingPiece.pieceType);
			if(winner)
			{
				return playerTurn.name;
			}
		}
		return "tie";
	}

	public boolean isThereWinner(int row, int column, PieceType pieceType) {
		boolean rowMatch= true;
		boolean columnMatch= true;
		boolean diagonalMatch= true;
		boolean antiDiagonalMatch= true;
		
		for(int i=0;i< gameBoard.size;i++)
			if(gameBoard.board[row][i]== null || gameBoard.board[row][i].pieceType !=pieceType)
			{
				rowMatch=false;
			}
		
		for(int i=0;i< gameBoard.size;i++)
			if(gameBoard.board[i][column]== null || gameBoard.board[i][column].pieceType != pieceType)
			{
				columnMatch=false;
			}
		for(int i=0,j=0;i< gameBoard.size;i++,j++)
			if(gameBoard.board[i][j]== null || gameBoard.board[i][j].pieceType != pieceType)
			{
				diagonalMatch=false;
			}
		
		for(int i=0,j=gameBoard.size-1;i< gameBoard.size;i++,j--)
			if(gameBoard.board[i][j]== null || gameBoard.board[i][j].pieceType != pieceType)
			{
				antiDiagonalMatch=false;
			}
		
		return rowMatch ||columnMatch ||diagonalMatch ||antiDiagonalMatch ;
	}
	
}
