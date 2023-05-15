package com.acaders.demo;

import java.util.Scanner;

class Guesser {
	int gNum;

	int guessNum() {
		System.out.println("Guesser! Kindly guess a number between 1 to 100");
		Scanner sc = new Scanner(System.in);
		gNum = sc.nextInt();
		return gNum;

	}
}

class Player {
	int pNum;

	int guessNum() {
		System.out.println("Player! Kindly guess a number between 1 to 100");
		Scanner sc = new Scanner(System.in);
		pNum = sc.nextInt();
		return pNum;

	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}

	public void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}

	public void compare() {
		if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
			System.out.println("Player1 & Player2 wins");
		} else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
			System.out.println("Player2 & Player3 wins");
		} else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
			System.out.println("Player1 & Player3 wins");
		} else if (numFromGuesser == numFromPlayer1) {
			System.out.println("Player1 wins");
		} else if (numFromGuesser == numFromPlayer2) {
			System.out.println("Player2 wins");
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 wins");
		} else {
			System.out.println("Game lost ! Try again");
		}
	}
}

public class Launch {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}
}