package com.bridgelabz.programs;

import java.util.Scanner;

public class SelectIndex {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char[] board=createEmptyBoard();
		char userLetter=input(scanner);
		char computerLetter=(userLetter=='X')?'O':'X';
		showBoard(board);
		int index=selectIndex(scanner);
	}
	public static char[] createEmptyBoard() {
		char[] emptyBoard=new char[10];
		for(int i=1;i<emptyBoard.length;i++) {
			emptyBoard[i]=' ';
		}
		return emptyBoard;
	}
	public static char input(Scanner sc) {
		System.out.println("Enter choice from X or O");		
		return sc.next().toUpperCase().charAt(0);
	}
	public static void showBoard(char[] b) {	
		for(int i=1;i<b.length;i++) {
				System.out.println(b[i]);
		}
	}
	public static int selectIndex(Scanner sc) {
		System.out.println("Select the index to move to desired location");
		return sc.nextInt();
	}
}
