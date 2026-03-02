package day2;

public class StringTest10086 {
   public static void main(String [] args) {
       String result1 = reverse("abc");
       System.out.println(result1);
       int[] arr = new int[]{1,2,2,4,5};
       String result2 = arrtostring(arr);
       System.out.println(result2);
    }

    //字符串反转
    public static String reverse(String str) {
       String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch=str.charAt(i);
            result+=ch;
        }
        return result;
    }
    //字符串拼接
    public static String arrtostring(int[] arr){
       if(arr.length==0) return "[]";
       if(arr==null) return "";
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                result+=arr[i]+"]";
            }
            else{
                result+=arr[i]+",";
            }
        }
        return result;

    }
}

