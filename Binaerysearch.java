public class Binaerysearch {
  static  int search(int arr[],int key)
    {
int start=0;
int end=arr.length-1;
while(start<=end)
{
    int mid=(start+end)/2;
    if(key==arr[mid])
    {
        return mid;
    }
    else if(key<arr[mid])
    {
        end=mid-1;
    }
    else
    {
        start=mid+1;
    }
}
return -1;
    }
    public static void main(String[] args) {
        
int arr[]={1,2,3,4,5,6,7};
int key=16;
int index=search(arr, key);
if(index==-1)
{
    System.out.println("not found");
}
else
System.out.println("index is "+ index);


    }
    
}
