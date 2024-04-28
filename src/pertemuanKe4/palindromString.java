package pertemuanKe4;

public class palindromString {
    public static void main(String[] args) {
        String kata = "ada";
        boolean isPalindrome = isPalindrome(kata);
        if (isPalindrome) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan termasuk palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Mengubah kata menjadi huruf kecil untuk memperlakukan huruf besar dan kecil dengan sama
        str = str.toLowerCase();
        
        // Menggunakan dua pointer, satu di awal dan satu di akhir kata
        int left = 0;
        int right = str.length() - 1;
        
        // Melakukan perbandingan karakter pada posisi yang sama dari awal dan akhir kata
        while (left < right) {
            // Jika karakter tidak cocok, langsung kembalikan false
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        // Jika semua karakter cocok, maka kata adalah palindrom
        return true;
    }
}
