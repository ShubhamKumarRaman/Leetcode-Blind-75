public class J01mergeAlternately {
    public static String mergeAlternately(String str1, String str2) {
        int ptr1 = 0;
        int ptr2 = 0;

        StringBuilder result = new StringBuilder();

        while (ptr1 < str1.length() && ptr2 < str2.length()) {
            result.append(str1.charAt(ptr1++));
            result.append(str2.charAt(ptr2++));
        }
        if (ptr1 != str1.length()) {
            result.append(str1.substring(ptr1, str1.length()));
        }
        if (ptr2 != str2.length()) {
            result.append(str2.substring(ptr2, str2.length()));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "pqrs";
        System.out.println(mergeAlternately(str1, str2));
    }
}