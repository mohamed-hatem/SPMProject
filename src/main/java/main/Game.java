package main;

import java.util.ArrayList;

public class Game {
	
	private String gameName;
	private String gameType;
	private double rate;
	private ArrayList<String> comments;
	
	public Game(String name,String type,double rate)
	{	gameName = name;
		gameType = type;
		this.rate=rate;
		comments = new ArrayList<String>();
	}
	public Game(String name,String type)
	{	gameName = name;
		gameType = type;
		this.rate=0.0;
		comments = new ArrayList<String>();
	}
	public void setRate(int sRate)
	{    
		rate+=sRate;
		rate/=2.0;

	}
	public double getRate()
	{
		return rate;
	}
   public boolean addComment(String newComment)
   {
	   if(comments.add(newComment))
		   return true;
	   return false;
   }
   
}