package com.bridgelab;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeandLader {
	public static void main(String[] args) {
		System.out.println("snake and ladder");
		
		int currentPosition=0,position=0,ladder=1,counter=0,win=0;
		int snakes[]= {6,11,19,23,45,66,98};
		int noPlay[]= {9,15,27,33,51,67,89};
		
		while(currentPosition<101) {
			int dice=(int)Math.floor(Math.random()*10)%6+1;
			position=dice+currentPosition;
			System.out.println("dice roll "+dice);
			for (int element : snakes) {
	            if (element == position) {
	                currentPosition= currentPosition-dice;
	                ladder=0;
	            }
	        }
			for (int element : noPlay) {
	            if (element == position) {
	            	currentPosition= currentPosition;
	                ladder=0;
	            }
	        }
			if (ladder == 1) {
				currentPosition+=dice;
			}
			ladder=1;
			
			counter++;
			
			if(currentPosition <0) {
				currentPosition=0;
			}
			
			if(currentPosition == 100) {
				System.out.println("WINNER");
				break;
			}
			
			if(currentPosition >100)
			{
			currentPosition=win;	
			}
			win=currentPosition;
			position= currentPosition;
			System.out.println("Current Position "+currentPosition);
			}
		System.out.println("total rolls "+counter);
	}
}
