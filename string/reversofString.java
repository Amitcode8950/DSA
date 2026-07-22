public class reversofString {
    static void rever(String name) {
        StringBuilder ans = new StringBuilder();
        int i = name.length() - 1;
        System.out.println(i);
        while (i >= 0) {
            while (i >= 0 && name.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;
            int j = i;
            while (j >= 0 && name.charAt(j) != ' ') {
                j--;
            }
            ans.append(name.substring(j + 1, i + 1));
            while (j >= 0 && name.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                ans.append(" ");
            }
            i=j;
        }
        System.out.println(ans.toString());

    }

    public static void main(String[] args) {
        String name = "i need sex";
        rever(name);
    }
}
