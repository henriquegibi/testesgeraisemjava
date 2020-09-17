package programa.de.testes.gerais;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;

public class ProgramaDeTestesGerais
{
    public static void main(String[] args)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        
        System.out.println(Locale.getDefault().getLanguage());
    }
}