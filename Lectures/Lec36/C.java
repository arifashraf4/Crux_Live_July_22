package Lec36;

public class C extends P {
    int d = 2;
    int d2 = 20;

    @Override //Used to make sure. Overrides anyway without @Override as well.
    public void fun() {
        System.out.println("Fun in C");
    }

    public void fun2(){
        System.out.println("Fun2 in C");
    }
}
