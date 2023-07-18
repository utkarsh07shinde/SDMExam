
public class admin {
public static void main(String[] args) {
		
		int array[]= {100,14,46,47,94,94,52,86,36,94,89};
		int i,j,max,secondmax=0;
		max=array[0];
		for(i=0;i<array.length;i++)
		{
			if(array[i]>=max)
			{
				max=array[i];
				//continue;
			}
			
		}
		for(j=0;j<array.length-1;j++)
		{
//			if(array[i]==max)
//			{
//				continue;
//			}
			if(array[j]>=secondmax && array[j]<max)
			{
				secondmax=array[j];
				
			}
		}
		System.out.println("Second highest="+secondmax);
	}
}
