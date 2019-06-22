public class LogicBoolean {
    static private String[] opersimbols = {"+","-","*","/"};
    static private String[] cHislaArabianAndRome = {"1","2","3","4","5","6","7","8","9","10","I","II","III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    public static boolean proverkanaznaki(String s){
        for (int i = 0; i <4; i++){
            String sub = opersimbols[i];
            if (s.indexOf(sub) != -1){
                return true;
            }
        }
    return false;}

    public static boolean Proverkachisel(String p){
        for (int i = 0; i < 20; i++){
            String s = cHislaArabianAndRome[i];
            if (p.equalsIgnoreCase(s))
                return true;
        }

    return false;}

    public static int Proverkachisel2 (String p){
        for (int i = 0; i < 20; i++){
            String s = cHislaArabianAndRome[i];
            if (p.equalsIgnoreCase(s))
                if (i < 10)
                    return 1;
        }
    return 0;}



}
