package day14_StringMethods;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "       batch 10      ";   //görevi olmayan gereksiz bosluklar atılır
        str1 = str1.trim();    //"batch 10"  --- modify edilemeyeceği için yeniden assign etmelisin.

        System.out.println(str1);


        System.out.println("-------------");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = "+ n1);

        int n2 = str2.indexOf("o");   //ilk o hangisi ise onu
        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("ool");  //diğer o yu bulmak için unique olmalısın
        System.out.println("n3 = " + n3);

        int nu = str2.lastIndexOf("o S");
        System.out.println("nu = " + nu);

        String str3 = "Java Programming Language";
        int nn= str3.indexOf("va");
        System.out.println("nn = " + nn);

        int n4 = str3.indexOf("gua");

        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");

        System.out.println("n5 = " + n5);

        System.out.println("-------------------------------");

        String s = "Java Nova Cava Wawa orange";
        //             012345

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        // int fifthA = s.lastIndexOf("va") + 1;    //bir ekleyerek de v nin yanındaki a nın index number bulunabilir
        int fifthA = s.lastIndexOf("a W") ;
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }
}
