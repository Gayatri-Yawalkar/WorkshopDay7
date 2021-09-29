package com.bridgelabz.programs;
//Uc5
import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char[] board=createEmptyBoard();
		char userLetter=input(scanner);
		char computerLetter=(userLetter=='X')?'O':'X';
		showBoard(board);
		int index=selectIndex(scanner);
		makeMove(board,index,userLetter);
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
	public static void makeMove(char b[],int i,char letter) {
		if(b[i]!=' ') {
			b[i]=letter;
		}
		else {
			System.out.println(i+"th location is not Empty");
		}
	}
}
