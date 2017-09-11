package sample.model;

public class PlayDohCircle
{
	//Declaration Section
	//Data member Section
	//NEED TO BE PRIVATE
	private int size; 
	
	public  PlayDohCircle()
	{
		this.size = 5;
	
	}
	
	public PlayDohCircle(int size)
	{
		this.size = size;
	}
	
	//How you define the object as text.
	public String toString()
	{
		String description = "I am a PlayDohCircle and my size is " + size;
		return description;
		
	}
}
