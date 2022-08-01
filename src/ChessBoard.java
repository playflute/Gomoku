
public class ChessBoard 
{
	private Chess[][] grid;
	
	public ChessBoard()
	{
		this.grid=new Chess[15][15];
		
	}
	
	public Chess[][] getGrid()
	{
		return this.grid;
		
	}
	
	public void showBoard()
	{
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<15; j++)
			{
				if(grid[i][j]==null)
				{
					System.out.print("E ");
				}
				else if(grid[i][j].getColor().equals("black"))
				{
					System.out.print("B ");
				}
				else 
				{
					System.out.print("W ");
				}
			}
			System.out.println();
		}
	}

}
