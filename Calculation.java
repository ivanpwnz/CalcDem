import java.util.HashMap;

public class Calculation {

    public static String Poluchaem_num(String p, int index){
        String[] numbers = p.split("\\+|-|\\*|/| ");
        return numbers[index];
    }

    public static char Poluchaem_Znak(String p, String num1){
        char c = p.charAt(num1.length());
        return c;
    }

    public static int ArabianCalculation (String nomeroUno, String nomeroDo, char operation){
        int num1 = Integer.parseInt(nomeroUno);
        int num2 = Integer.parseInt(nomeroDo);
        int result=0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        return result;
    }

    public static String pArsem (String num){
        String stp = num.toUpperCase();
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("I","1");
        map.put("II","2");
        map.put("III","3");
        map.put("IV","4");
        map.put("V","5");
        map.put("VI","6");
        map.put("VII","7");
        map.put("VIII","8");
        map.put("IX","9");
        map.put("X","10");

        String first = map.get(stp);
        return first;

    }
}
