package labass6;

public class main1 {
	public void run()
	{
		int[] array= {10,15,20,25,30};
		int square=1;
		for(int i=0;i<array.length;i++)
		{
			square=array[i]*array[i];
			System.out.println("square"+array[i]+" "+square);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 main1 obj=new  main1();
		
		 float avg=0;
		   int sum=0;
		   obj.start();//calling method
		   for(int i=1;i<=50;i++)
		   {
			   System.out.println(i);
			   sum+=i;//find sum
		   }
		   System.out.println("Sum:"+sum);
		   avg=sum/50;
		   System.out.println("Average:"+avg);

	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
}
