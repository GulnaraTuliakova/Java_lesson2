// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

public class lesson2_4_5_6 {
    public static void main(String[] args) {

        StringBuilder newStr1 = new StringBuilder();
        StringBuilder newStr2 = new StringBuilder();
        StringBuilder newStr3 = new StringBuilder();
        int x = 3;
        int y = 56;
        int sumXY = x + y;
        int subXY = x - y;
        int multXY = x * y;

        newStr1.append(x);
        newStr1.append(" + ");
        newStr1.append(y);
        newStr1.append(" = ");
        newStr1.append(sumXY);

        System.out.println(newStr1);

        newStr2.append(x);
        newStr2.append(" - ");
        newStr2.append(y);
        newStr2.append(" = ");
        newStr2.append(subXY);

        System.out.println(newStr2);

        newStr3.append(x);
        newStr3.append(" * ");
        newStr3.append(y);
        newStr3.append(" = ");
        newStr3.append(multXY);

// 5.  Замените символ “=” на слово “равно”. 
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        System.out.println(newStr3);
        for (int j = 0; j < newStr1.length(); j++) {
            if (newStr1.charAt(j) == '=') {
                newStr1.deleteCharAt(j);
                newStr1.insert(j, "равно");
            }
        }
        System.out.println(newStr1);

        for (int j = 0; j < newStr2.length(); j++) {
            if (newStr2.charAt(j) == '=') {
                newStr2.deleteCharAt(j);
                newStr2.insert(j, "равно");
            }
        }
        System.out.println(newStr2);

//6 *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace(). 

        StringBuilder anotherString3 = new StringBuilder(newStr3);
        for (int i = 0; i < newStr3.length(); i++) {
            if (newStr3.charAt(i) == '=') {
               anotherString3.replace(i, i + 1, "равно");
            }
        }

        System.out.println(anotherString3);

    }

}
