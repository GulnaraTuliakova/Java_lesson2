public class lesson2 {
    public static void main(String[] args) {
        // *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

    String str = new String ("Wellcome");
    String[] result = str.split("");
   
    for (int i = 0; i < result.length; i++) {
    System.out.println(result[result.length-1-i]);

    }
    } 
}

 