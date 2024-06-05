package com.LLD.TicTacToe;

public class Board {

	public int size;
	public PlayingPiece[][] board;
	
	public Board(int size) {
		this.size=size;
		board=new PlayingPiece[size][size];
	}

	public void printBoard() {
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(board[i][j]!=null)
				System.out.print(board[i][j].pieceType+" |");
				else
				System.out.print("  |");
			}
			System.out.println();
		}
		
	}

	public boolean isFreeCellsExists() {
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(board[i][j]==null)
					return true;
			}
		}
		return false;
	}

	public boolean addpiece(int row, int column, PlayingPiece playingPiece) {
		if(board[row][column]!= null)
		{
			return false;
		}
		board[row][column]=playingPiece;
		return true;
	}

}
