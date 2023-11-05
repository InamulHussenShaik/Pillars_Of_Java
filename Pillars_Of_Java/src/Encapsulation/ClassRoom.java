package Encapsulation;

public class ClassRoom {
	private int temparature;
	void setTemparature(int temp)
	{
		if(temp>0 && temp < 35)
		{
		  temparature=temp;
		}
	}
	int getTemparature()
	{
		return temparature;
	}

}
