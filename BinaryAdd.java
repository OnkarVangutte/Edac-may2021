import java.util.*;
class BinaryAdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two binary numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int index=0, n=0,i;
		int Binary[]=new int [10];
		
		while(n<3)
		{
			if(index==0)
			{
				Binary[index]=(n1%10+n2%10);
			}
			else
			{
				if(index==1)
				{
					Binary[index]=((n1%10+n2%10)%2);
					carry=1;
				}
				else
					Binary[index]=carry;
			}
			n1=n1/10;
			n2=n2/10;
			n++;
			index++;
		}
		for(i=index-1;i>=0;i--)
		{
			System.out.print(Binary[i]);
		}
		System.out.println();
	}
}