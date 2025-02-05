public class overloading {
    // public static void show(long i)
    // {
    //     System.out.println("it is int method");
    // }
    // public static void show(float j)
    // {
    //     System.out.println("it is float method");
    // }
    public static void show(int i,float f)
    {
        System.out.println("first method is callled");
    }
    public static void show(float f, int i)
    {
        System.out.println("second method is called");
    }

    public static void main(String[] args) {
        // show(10,20.f);
        // show(20.f,10);
        // show(10.6);
        // show(10,10);
        
    }
    
}
