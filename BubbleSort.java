import java.util.Scanner;

class BubbleSort{

public static void main(String[] args)

{
  Scanner a = new Scanner(System.in);
  int t,j,i,b;
  System.out.print("Enter No. of elements: ");
  b=a.nextInt();
  int s[]=new int[100];

  for(i=0;i<b;i++)
  {
    System.out.print("Enter elements No."+(i+1)+": ");
    s[i]=a.nextInt();
  }

for(i=0;i<b;i++){

  for(j=0;j<b-1;j++){

   if(s[j]>s[j+1])
    { 
     t=s[j];
     s[j]=s[j+1];
     s[j+1]=t;
    }
  }
}

System.out.println("-->Sorted Elements:");

for(i=0;i<b;i++)
{
System.out.println(s[i]);
}
 
}
}
