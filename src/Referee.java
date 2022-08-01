
public class Referee extends AbstractReferee
{
	
	private int count=1;
	private String color;
	
	public Referee(String name)
	{
		super(name);
		
	}
	
	public int getCount()
	{
		return count;
	}
	
	public boolean judge(ChessBoard board)
	{
		if(judgeRow(board)||judgeCol(board)||judgeTopLeft(board)||judgeBottomLeft(board)||judgeTopRight(board)||judgeBottomRight(board))
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean judgeRow(ChessBoard board)
	{
		
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<14; j++)
			{
				if((board.getGrid()[i][j]!=null) && (board.getGrid()[i][j+1]!=null))
				{				
					if(board.getGrid()[i][j].getColor().equals(board.getGrid()[i][j+1].getColor()))
					{
						color=board.getGrid()[i][j].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						count=1;
						color=null;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		
		return false;
	}
	
	
	private boolean judgeCol(ChessBoard board)
	{
		int count=1;
		
		for(int j=0; j<15; j++)
		{
			for(int i=0; i<14; i++)
			{
				if((board.getGrid()[i][j]!=null) && (board.getGrid()[i+1][j]!=null))
				{				
					if(board.getGrid()[i][j].getColor().equals(board.getGrid()[i+1][j].getColor()))
					{
						color=board.getGrid()[i][j].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						color=null;
						count=1;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		
		return false;
	}
	
	private boolean judgeTopLeft(ChessBoard board)
	{
		int count=1;
		
		for(int i=4; i<15; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				if((board.getGrid()[i-j][j]!=null) && (board.getGrid()[i-j-1][j+1]!=null))
				{				
					if(board.getGrid()[i-j][j].getColor().equals(board.getGrid()[i-j-1][j+1].getColor()))
					{
						color=board.getGrid()[i-j][j].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						color=null;
						count=1;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		return false;
	}
	
	private boolean judgeTopRight(ChessBoard board)
	{
		int count=1;
		
		for(int i=0; i<11; i++)
		{
			for(int j=0; j<15-i; j++)
			{
				if((board.getGrid()[j][i+j]!=null) && (board.getGrid()[j+1][j+i+1]!=null))
				{				
					if(board.getGrid()[j][j+i].getColor().equals(board.getGrid()[j+1][j+i+1].getColor()))
					{
						color=board.getGrid()[j][j+i].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						color=null;
						count=1;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		return false;
	}
	
	
	private boolean judgeBottomLeft(ChessBoard board)
	{
		int count=1;
		
		for(int i=10; i>0; i--)
		{
			for(int j=0; j<14-i; j++)
			{
				if((board.getGrid()[i+j][j]!=null) && (board.getGrid()[i+j+1][j+1]!=null))
				{	
					
					if(board.getGrid()[i+j][j].getColor().equals(board.getGrid()[i+j+1][j+1].getColor()))
					{
						color=board.getGrid()[i+j][j].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						color=null;
						count=1;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		return false;
	}
	
	private boolean judgeBottomRight(ChessBoard board)
	{
		int count=1;
		
		for(int i=24; i>13; i--)
		{
			for(int j=14; j>=i-j; j--)
			{
				if((board.getGrid()[j][i-j]!=null) && (board.getGrid()[j-1][i-j+1]!=null))
				{	
					
					if(board.getGrid()[j][i-j].getColor().equals(board.getGrid()[j-1][i-j+1].getColor()))
					{
						color=board.getGrid()[j][i-j].getColor();
						count++;
						if(count==5)
						{
							System.out.println(color);
							return true;
						}
						
					}
					else
					{
						color=null;
						count=1;
					}
				}
				else
				{
					count=1;
				}
				
			}
		}
		return false;
	}

	
	
}
