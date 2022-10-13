//7 **Сравнить время выполнения пунка 6 
// со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

public class lesson2_7 {
    public static void main(String[] args) {
        // Создание string и счетчик
        long start, end;
        start = System.currentTimeMillis();
        String str = new String();
        str = "=";
        for (int index = 0; index < 10_01; index++) {
            str += "=";
        }
        System.out.println(str);
        end = System.currentTimeMillis();
        System.out.println(end - start);

        // Создание StringBuilder и счетчик
        start = System.currentTimeMillis();
        StringBuilder strBil = new StringBuilder();
        for (int index = 0; index < 10_01; index++) {
            strBil.append("=");
        }
        System.out.println(strBil);
        end = System.currentTimeMillis();
        System.out.println(end - start);


    //  Замена StringBuilder и счетчик
        start = System.currentTimeMillis();
        StringBuilder anotherStrBil = new StringBuilder(strBil);
        for (int j = 0; j < anotherStrBil.length(); j++) {
            if (anotherStrBil.charAt(j) == '=') {
                anotherStrBil.deleteCharAt(j);
                anotherStrBil.insert(j, "равно");
            }
        }
        System.out.println(anotherStrBil);
        end = System.currentTimeMillis();
        System.out.println(end - start);


  //  Замена String  и счетчик 
  start = System.currentTimeMillis();
  String anotherStr = new String(str);

  for (int j = 0; j < anotherStr.length(); j++) {
        anotherStrBil.toString().replace("=", "равно");}
  System.out.println(anotherStrBil);
  end = System.currentTimeMillis();
  System.out.println(end - start);

    
}}   
               
 

       

     

  
        
    
    





