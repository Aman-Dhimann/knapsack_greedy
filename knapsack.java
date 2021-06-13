package ada;

import java.util.Scanner;

public class knapsack {
	public void knap(double[] w,double[] p,int n,double cap) {
		double r[]=new double[n];
	    for (int i=0;i<n;i++) {
	    	 r[i]=Double.valueOf(p[i]/w[i]);
	    }
	    double temp=0, temp1=0;
		   for (int i=0;i<n;i++) {
		    	  for(int j=0; j < (r.length-1); j++){  
		              if(r[j] < r[j+1]){  
		                     
		                     temp = r[j];  
		                     r[j] = r[j+1];  
		                     r[j+1] = temp;  
		                     
		                     temp1 = w[j];  
		                     w[j] = w[j+1];  
		                     w[j+1] = temp1; 
		                     
		                     temp1 = p[j];  
		                     p[j] = p[j+1];  
		                     p[j+1] = temp1; 
		                     
		    }
		    }
		    	  } System.out.println("ratios");  for (int i=0;i<n;i++) {
		   		   System.out.print(r[i]+ " ");}System.out.println("\nweights");
		    	  for (int i=0;i<n;i++) {
			   		   System.out.print(w[i]+ " ");}System.out.println("\nvalues");
		    	  for (int i=0;i<n;i++) {
			   		   System.out.print(p[i]+ " ");}
		   double profit = 0,sum=0;
		int i=0;
		  while(sum<cap) {
			   
			   sum=w[i]+sum;
			   profit=p[i]+profit;
			   i++;
			
			   }   if (sum>cap) {
				   sum=sum-w[i-1];
				   profit=profit-p[i-1];
			   }
			   
		  
		  double leftspace=cap-sum;
		  
		  profit=profit+((leftspace/w[i-1])*p[i-1]);
		  
		  System.out.println("total profit is "+profit);
		  
		  
			   
		   }

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size ");
		int si=sc.nextInt();
		System.out.println("enter the capacity ");
		double cap=sc.nextInt();
			   double w[]=new double [si];
			   System.out.println("enter weights");
			   for (int i=0;i<si;i++) {
				   w[i]=sc.nextInt();
	
}double p[]=new double[si];
System.out.println("enter values");
			   for (int i=0;i<si;i++) {
				   p[i]=sc.nextInt();	
}
			   knapsack ob =new knapsack();
			  ob.knap( w, p, si,cap );
}
}
