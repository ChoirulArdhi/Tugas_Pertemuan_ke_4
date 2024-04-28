package pertemuanKe4;

public class similarityString {
    public static void main(String[] args) {
    //menggunakan method equals (untuk mengecek kesamaan keseluruhan karakter)
    String kata1 = "Hallo";
    String kata2 = "Hallo";
   
    if(kata1.equals(kata2)){
        System.out.println("Karakter pada kata1 dan kata2 terbukti sama ");
    }else{
        System.out.println("Karakter pada kata1 dan kata2 terbukti belum sama ");
    }
    
    //menggunakan method equalsIgnoreCase (Mengabaikan huruf besar dan kecil)
    String kata01 = "Hallo";
    String kata02 = "hallo";
    if(kata01.equalsIgnoreCase(kata02)){
       System.out.println("Karakter pada kata01 dan kata02 terbukti sama ");
    }else{
        System.out.println("Karakter pada kata01 dan kata02 terbukti belum sama ");
    }

    }
    
}
