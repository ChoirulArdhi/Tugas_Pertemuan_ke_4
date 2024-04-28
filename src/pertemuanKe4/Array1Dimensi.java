package pertemuanKe4;

public class Array1Dimensi {

    public static void main(String[] args) {
//        int a[] = new int[5];
//        a[0] = 100;
//        a[1] = 300;
//        a[2] = 400;
//        a[3] = 500;
//        a[4] = 600;
        int[] a = {2,4,5,6,9,11,200,20};
        //Semua array
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        //Nilai tertinggi
        int max = a[0];
        for (int i = max; i<a.length; i++){
            if (a[i]> max){
                max = a[i]; 
            }
        }
        //Nilai Terendah
        int min = a[0];
        for (int i = min; i<a.length; i++){
            if (a[i]< min){
                min = a[i]; 
            }
        }
        
        //Nilai Rata-rata
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        
        double average = total / a.length;
        System.out.println("Nilai Rata-rata = " + average);
        System.out.println("Nilai maximum   = " + max);
        System.out.println("Nilai minimum   = " + min);
        
    }
    
}
