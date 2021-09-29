package com.bridgelabz.programs;
//Uc1
public class createEmptyBoard {
	public static void main(String[] args) {
		createEmptyBoard();
	}
	public static void createEmptyBoard() {
		char[] emptyBoard=new char[10];
		for(int i=1;i<emptyBoard.length;i++) {
			emptyBoard[i]=' ';
		}
	}
}
