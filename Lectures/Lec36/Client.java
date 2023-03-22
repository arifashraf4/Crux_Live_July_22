package Lec36;

public class Client {
    public static void main(String[] args) {
//        //Case 1:
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

//        //Case 2:
//        P obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//
//        System.out.println(((C) (obj)).d);
//        System.out.println(((C) (obj)).d2);
//
//        obj.fun1();
//        ((C)(obj)).fun2();
//
//        obj.fun();
//
//        P obj1 = new P();
//        obj1.fun();

//        //Case 3: Gives Error
//        C obj2 = new P();
//        System.out.println(obj2.d);
//        System.out.println(obj2.d1);
//        System.out.println(obj2.d2);

        // Case 4
        C obj3 = new C();
        System.out.println(obj3.d);  //2
        System.out.println(obj3.d1); //10
        System.out.println(obj3.d2); //20
        System.out.println(((P) (obj3)).d); //1


    }
}
