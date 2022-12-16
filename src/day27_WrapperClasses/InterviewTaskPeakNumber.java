package day27_WrapperClasses;

public class InterviewTaskPeakNumber {
    public static void main(String[] args) {
//peakNumber: A number in an array bigger than its neighbours

    int [] list ={1,3,5,4,7,8};
        for (int i = 1; i < list.length-1; i++) {
            if(list[i]>list[i-1]&&list[i]>list[i+1]){
                System.out.println(list[i]);
            }

    }

}
}
