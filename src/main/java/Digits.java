import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		digitList = new ArrayList<Integer>();
		if (num==0){
			digitList.add(0);
		}
		else{
			while(num>0){
				digitList.add(0,num%10);
				num=num/10;
			}
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		boolean aden = true; 


for (int i = 0; i<digitList.size()-1;i++){
	if (digitList.get(i)>=digitList.get(i+1)){
		aden=false;
	break;}
}


		return aden;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
