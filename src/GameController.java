import java.util.*;
import java.io.*;

public class GameController {

	public static void main(String[] args) 
	{
		
		ChessBoard board=new ChessBoard();
		Player lily=new Player("Lily", "white");
		Player tom=new Player("Tom", "black");
		Referee peter=new Referee("Peter");
		
		Scanner s=new Scanner(System.in);
		int row,col,r,c;
		
		while(true)
		{
			//1 white firstly put down	

			System.out.print("白方请输入行:");
		    row=s.nextInt();
		    System.out.print("白方请输入列:");
		    col=s.nextInt();
				
		    while(lily.putDownChess(board, row, col)==false)
			{	
		    	System.out.println("已有棋子，请重下");
				System.out.print("白方请输入行:");
			    row=s.nextInt();
			    System.out.print("白方请输入列:");
			    col=s.nextInt();
			}
		    
			board.showBoard();
			if(peter.judge(board)==true)
			{
				System.out.print("congratulations!");
				break;
			}
			else
			{
									
				System.out.print("黑色请输入行:");
				r=s.nextInt();
				System.out.print("黑色请输入列:");
				c=s.nextInt();
				
				while(tom.putDownChess(board, r, c)==false)
				{	
					System.out.println("已有棋子，请重下");
					System.out.print("黑色请输入行:");
					r=s.nextInt();
					System.out.print("黑色请输入列:");
					c=s.nextInt();
				}	
				
				board.showBoard();
				if(peter.judge(board)==true)
				{
					System.out.println("congratulations!");
					break;
				}
									
			}
								
		}	
				
			
	}
}
		
//		lily.putDownChess(board, 0, 0);
//		lily.putDownChess(board, 1, 1);
//		lily.putDownChess(board, 2, 2);
//		lily.putDownChess(board, 3, 3);
//		lily.putDownChess(board, 4, 4);
//		
//		System.out.println(peter.judgeDR(board));
		
//		lily.putDownChess(board, 4, 1);
//		lily.putDownChess(board, 3, 2);
//		lily.putDownChess(board, 2, 3);
//		lily.putDownChess(board, 1, 4);
//		lily.putDownChess(board, 5, 0);
//		
//		System.out.println(peter.judgeDL(board));
		
//		lily.putDownChess(board, 0, 0);
//		lily.putDownChess(board, 0, 1);
//		lily.putDownChess(board, 0, 2);
//		lily.putDownChess(board, 0, 3);
//		lily.putDownChess(board, 0, 4);
		
		
//		System.out.println(peter.judgeRow(board));

		
		
//		board.showBoard();
		

