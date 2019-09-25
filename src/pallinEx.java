public class pallinEx {
    public static void main(String[] args){
        String str="abcba";
        int last=str.length()-1;
        boolean b= pallindrome(str,0,last);
        System.out.println(b);

    }
    public static boolean pallindrome(String str,int first,int last){

        if(first<=last) {
            if (str.charAt(first)==(str.charAt(last))) {
                first++;
                last--;
                return pallindrome(str,first,last);
                //return true;

            }
            else{
                return false;
            }

        }
//        if(first==last){
//            return true;
//        }
        return true;
    }

}
