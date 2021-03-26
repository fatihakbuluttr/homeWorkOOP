package Lesson17;

public class CountWord {
    public static void main(String[] args) {
        //Bir stringiçindeki tüm kelimeleri saymak için java yöntemi yazın.

        String str = "merhaba dünya işin iş";
        count(str);
    }

    public static void count(String str) {

        String[] arrOfStr = str.split(" ");

        System.out.println("Kelime sayısı: " + arrOfStr.length);
        for (String a : arrOfStr)
            System.out.print(a + " - ");
       }
}
