package sample.model;

public class PlayDohSquare
{
	private int size;
	
	public PlayDohSquare()
	{
		this.size = 50;
		
	}
	
	public PlayDohSquare(int size)
	{
		this.size = size;
	}
	public String toString()
	{
		String description = "I am a PlayDohSquare and my size is " + size;
		return description;
		
	}
	

}
