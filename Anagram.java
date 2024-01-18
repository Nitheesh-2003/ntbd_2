import java.util.*;

public class Anagram{
    public static boolean anagramChecker(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length() != str2.length())
            return false;
        
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1="";
        String str2="";
        System.out.println("Enter first string : ");
        str1=obj.nextLine();
        System.out.println("Enter second string : ");
        str2=obj.nextLine();
        System.err.println(anagramChecker(str1, str2));
        obj.close();
    }
}