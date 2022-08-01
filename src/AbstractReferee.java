
public abstract class AbstractReferee 
{
	private String name;

	public AbstractReferee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract boolean judge(ChessBoard c);

}
