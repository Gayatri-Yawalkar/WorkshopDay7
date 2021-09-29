package com.bridgelabz.programs;

import java.util.Scanner;

public class ShowBoard {
	public static void main(String[] args) {
		char[] board=createEmptyBoard();
		char userLetter=input();
		showBoard(board);
	}
	public static char[] createEmptyBoard() {
		char[] emptyBoard=new char[10];
		for(int i=1;i<emptyBoard.length;i++) {
			emptyBoard[i]=' ';
		}
		return emptyBoard;
	}
	public static char input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter choice from X or O");		
		return scanner.next().toUpperCase().charAt(0);
	}
	public static void showBoard(char[] b) {	
		for(int i=1;i<b.length;i++) {
				System.out.println(b[i]);
		}
	}

}
