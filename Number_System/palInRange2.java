class Main {

    static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 100;

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
