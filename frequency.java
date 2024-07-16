public class frequency {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,2,2,2,2,3,3,4,5,5,7};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count=0; 
for(int j=i;j<arr.length;j++)
{
  
    if(arr[i]==arr[j])
    {
        count++;
    }
}
System.out.println(count);
        }
    }
    
}
