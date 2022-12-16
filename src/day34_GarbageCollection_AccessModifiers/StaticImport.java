package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {


        System.out.println(pi);


    }

}

/*
static import:

			import static packageName.className.staticMember;  // imports one static member of a class
			import static packageName.className.*;			 // imports all static members of a class
 */