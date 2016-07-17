package session2.assignment2;


public class PrimeNumbers {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<100 ;i++) {
			if(i==2)
				System.out.print(i+" ");
			else
		    {
		     for(j=2;j<i;j++)
		      {
		       if(i%j==0)
		        break;
		      }
		     if(i==j)
		    	 System.out.print(i+" ");
		     }
		}
		
	}

}
