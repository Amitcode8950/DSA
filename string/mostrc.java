
public class mostrc {
    public static void mostcount(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int max=-1;
        char a=' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                a = (char)(i+'a');
            }
        }
        System.out.println("the max count "+max);
        System.out.println(a);
    }

    public static void main(String[] args) {
        String s = "testsampleeeee";
        mostcount(s);
    }
}
