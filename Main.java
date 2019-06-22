import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException, ExceptionStyles {
        int otvet = 0;
        String Strokovoechislo1 ="";
        String Strokovoechislo2 ="";
        boolean proverka1= false;
        boolean proverka2 = false;
        Atten.Privetstvie();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String soobshenie = reader.readLine();
        String soobsheniewospace = soobshenie.replaceAll("\\s+","");
        proverka1= LogicBoolean.proverkanaznaki(soobsheniewospace);
        if (proverka1==false) {
            Atten.AttentionNoOperation();
            System.exit(0);
        }
        try {
            Strokovoechislo1 = Calculation.Poluchaem_num(soobsheniewospace, 0);
            Strokovoechislo2 = Calculation.Poluchaem_num(soobsheniewospace, 1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            Atten.AttentionOOB();
            System.out.println(e);
            System.exit(0);}

        char c = Calculation.Poluchaem_Znak(soobsheniewospace,Strokovoechislo1);
        proverka2 = LogicBoolean.Proverkachisel(Strokovoechislo1)&LogicBoolean.Proverkachisel(Strokovoechislo2);
        if (proverka2==false){
            Atten.AttentionNevernieChisla();
            System.exit(0);
        }
        if (LogicBoolean.Proverkachisel2(Strokovoechislo1)+LogicBoolean.Proverkachisel2(Strokovoechislo2)==1){
            throw new ExceptionStyles("Числа которые вы ввели имеют разный тип, а должны одинакоый, давайте по новой");

        }

        if (LogicBoolean.Proverkachisel2(Strokovoechislo1)+LogicBoolean.Proverkachisel2(Strokovoechislo2)==2){
            otvet = Calculation.ArabianCalculation(Strokovoechislo1,Strokovoechislo2,c);
            Atten.AttentionOtvetArabian();
            System.out.println(otvet);
        }
        if (LogicBoolean.Proverkachisel2(Strokovoechislo1)+LogicBoolean.Proverkachisel2(Strokovoechislo2)==0){
            String arabch1 = Calculation.pArsem(Strokovoechislo1);
            String arabch2 = Calculation.pArsem(Strokovoechislo2);
            otvet = Calculation.ArabianCalculation(arabch1,arabch2,c);
            String romanOtvet = RomanNumber.toRoman(otvet);
            Atten.AttentionOtvetArabian();
            System.out.println(romanOtvet);
        }

    }
}
