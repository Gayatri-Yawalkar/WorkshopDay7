package com.bridgelabz.programs;

import java.util.Scanner;

public class InputChoice {
	public static void main(String[] args) {
		createEmptyBoard();
		char userLetter=input();
	}
	public static void createEmptyBoard() {
		char[] emptyBoard=new char[10];
		for(int i=1;i<emptyBoard.length;i++) {
			emptyBoard[i]=' ';
		}
	}
	public static char input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter choice from X or O");		
		return scanner.next().toUpperCase().charAt(0);
	}
}
