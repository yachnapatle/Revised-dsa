public class addnumber {
    public static void main(String[] args) {
        String s3="1234567";
        int sum=0;
        for(int i=0;i<s3.length();i++)
        {
char ch=s3.charAt(i);
// int s1=;
sum=sum+ch-'0';
        }
        System.out.println(sum);
    }
    
}
