import java.util.Scanner;
public class Main
{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String string1 = sc.nextLine();
    String string2 = sc.nextLine();
    int num = sc.nextInt();
    System.out.println(lastFirstN(string1, string2, num));
    sc.nextLine();
    String stringA = sc.nextLine();
    String stringB = sc.nextLine();
    stringManip(stringA, stringB);
  }

  public static String lastFirstN(String s1, String s2, int n){
    int indexOfNToLast = s1.length() - n;
    String lastS1 = s1.substring(indexOfNToLast);
    String firstS2 = s2.substring(0,n);
    String output = lastS1 + firstS2;
    return output;
  }
  
  public static void stringManip(String s1, String s2){
    String upS1 = s1.toUpperCase();
    String firstLetterS2 = s2.substring(0,1);
    String upperLetterS2 = firstLetterS2.toUpperCase();
    String lettersS2 = s2.substring(1);
    String lowerLettersS2 = lettersS2.toLowerCase();
    System.out.println(upS1);
    System.out.println(upperLetterS2 + lowerLettersS2);
  }
  
}
