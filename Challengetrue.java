public class Challengetrue {
    public static void main(String[] args) throws Exception {
    
        /* Challenge!
         * True jika
         * 10-15 atau 20-30 dan 13-30
         * Nilai 1 = 11, 12, 13, 14
         * NIlai 2 = 14, 15, 16,..., 19
         * Nilai 3 = 21, 22, 23,..., 29
         */
        byte a = 100;
        boolean nilai1 = a > 10 && a < 15;
        boolean nilai2 = a > 13 && a < 20;
        boolean nilai3 = a > 20 && a < 30;
        boolean hasil = nilai1 && nilai2 || nilai3;
        System.out.println(hasil);

        byte m = 100;
        boolean nilaiA = m > 1 && m < 3;
        boolean nilaiB = m > 88 && m < 101;
        boolean nilaiC = m > 99 && m < 101;
        boolean result = nilaiA && nilaiB || nilaiC;
        System.out.println(result);
    }
}
