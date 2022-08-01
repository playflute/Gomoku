
public class Player 
{
	private String name;
	private String color;
	
	public Player(String name, String color)
	{
		this.name=name;
		this.color=color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public boolean putDownChess(ChessBoard Board, int row, int col)
	{
		if(Board.getGrid()[row][col]!=null)
		{
			return false;
		}
		else
		{
			Board.getGrid()[row][col]=new Chess(color);
			return true;
		}
	}

}
