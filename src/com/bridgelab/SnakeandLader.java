package com.bridgelab;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeandLader {

	public static void main(String[] args) {
		
		int N = 100;
		int moves[] = new int[N];
		for (int i = 0; i < N; i++)
			moves[i] = -1;
		
		double ROLL_DICE = Math.floor(Math.random()*10)%7;
		System.out.println("Dice Roll : "+ROLL_DICE);
		
	}
}
