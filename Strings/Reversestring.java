package placement_Preparation;

public class Reversestring {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        // Create object of Reversestring class
        Reversestring obj = new Reversestring();
        obj.reverseString(s);

        System.out.print("[");                                          // Print the reversed array
        for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
            if (i < s.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}


