import java.util.Scanner;
public class Main
{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String string1 = sc.nextLine();
    String string2 = sc.nextLine();
    int num = sc.nextInt();
    System.out.println(lastFirstN(string1, string2, num));
  }

  public static String lastFirstN(String s1, String s2, int n){
    String lastN = s1.substring(n-1);
    String firstN = s2.substring(0,n);
    return(lastN+firstN);
  }
  /* 
  public static void stringManip(String s1, String s2){
    String upS1 = s1.toUpperCase();
    String firstLetterS2 = s2.substring(0,1);
  }
  */
}
