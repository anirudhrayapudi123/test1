public class recursionEx {
    public static void main(String[] args){
        //int arr[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int num=20;
        reverseOrder(num);

        printNumber(num);
    }
    public static void reverseOrder(int num){

        if(num>0){
           System.out.println(num);
           reverseOrder(num-1);
        }
        else{
            System.out.print(0);
            return;
        }

    }
    static void printNumber(int num){
        if(num<0)
            return;

        printNumber(num-1);
        System.out.println(num+" ");

    }

}
