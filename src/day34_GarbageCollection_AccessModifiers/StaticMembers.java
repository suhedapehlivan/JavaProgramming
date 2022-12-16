package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {   //static members: variables, methods, blocks, class
    //only inner class can be STATIC, because inner class belongs a class.
    int a;

    class class1{

    }

    public static int num = 100;

    public static void method(){

    }

    static{

    }

}




class A { // outer class

    static class B { // inner class

        public static void method1(){

        }

    }

}


class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}






class X{

}

class Y{

}

class Z{
    static class Q{

    }
}
