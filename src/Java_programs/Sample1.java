package Java_programs;

public class Sample1 
{
	public static void main(String[] args) {
		String s1="i love java and job";
		String[] a = s1.split(" ");
		System.out.println(a.length);
		String s2="";
		for(int i=0;i<a.length;i++)
		{ 
			
			if(i%2==0)
			
			{
				System.out.print(a[i]+" ");
				
				
			}
			else
			{
				for(int j=i;j<a.length;j=j+2)
				{
					
					s2=a[i];
					a[i]=a[j];
					a[j]=s2;
				}
				/*String str=a[i];
				String rev="";
				for(int k=str.length()-1;k>=0;k--)
				{
					rev=rev+str.charAt(k);
				}*/
				System.out.print(a[i]+" ");
			}
		}
	}

}
