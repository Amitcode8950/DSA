import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();
        // System.out.println(str1 +  " " +str2);
        String str2 = "  ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());
        String str3 = "   Amit   ";
        System.out.println(str3.length());
        System.out.println(str3.trim());
        String str = "Amit";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        String str1 = "amit";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(1, 3));
        System.out.println(str.contains("Amit"));
        System.out.println(str.replace("A", "B"));
        System.out.println(str.replace("Amit", "Amit"));
        String str4 ="my name is Amit kumar";
        System.out.println(str4.contains("name"));
        System.out.println(str4.substring(3,16));
        int a =56565;
        String str5 = String.valueOf(a);
        System.out.println(str5);
        String str6 ="Amit kumar";
        System.out.println(str6.startsWith("Am"));
        System.out.println(str6.endsWith("ar"));

        char[] crr=str6.toCharArray();
        for(int i=0;i<crr.length;i++){
            System.out.println("my value is : "+crr[i]);
        }

        System.out.println(str6.indexOf("k"));
      String str7 ="My,name,is,Amit,kumar";
      String [] word = str7.split(",");
      for(String w:word){
        System.out.println(w);
      }
      System.out.println(str7.replace(",", " "));
        
    }
}
