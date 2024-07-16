public class Linearsearch {

    static int search( int arr[],int key)
    {
for(int i=0;i<arr.length;i++)
{
    if(key==arr[i])
    {
        return i;
    }
}
return-1;

    }

    public static void main(String[] args) {
        int [] arr={12,89,2,99,123};
        int index=search(arr, 992);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("index is"+ index);
        }
        
        
    }
    
}
