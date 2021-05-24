package core.staticdemo;

public class StaticDemo {

    static {
        System.out.println("Inside StaticDemo static block");
    }

    {
        System.out.println("Inside StaticDemo instance block");
    }

    public static void main(String[] args) {
        StaticDemo sd1 = null;
        StaticDemo sd2 = new StaticDemo();

        Loader ld1 = null;
        //Loader ld2=new Loader();
    }
}

class Loader{
    static {
        System.out.println("Inside Loader static block");
    }

    {
        System.out.println("Inside Loader instance block");
    }
}

