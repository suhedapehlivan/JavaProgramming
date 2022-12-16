package day16_ForLoopPractices;

public class Reverse {

    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:      01234...

        String result = ""; //contain reversed version of str
        //noopS nedooW

        for (int i = str.length()-1; i >=0; i--){ //i: index numbers of str (starting last index to index 0)
            result += str.charAt(i);  //adding each character to result

        }
        System.out.println(result);
    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
/*
for reverse
1. string verilen nedir kontrol et
2. boş string tanımla
3.kelimenin uzunlugu için length method
4. bu len charat ile tanımlarken len-1 yap, cunku len indexten 1 büyük oluyor
5.loop len-1 e kadar olacak
6. bu char değeri concate olacak boş tanımladığımız string result değerine +=


 */