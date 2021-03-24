import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static String ValidarIdade(int dia,int mes,int ano){
        //Objetos
        SimpleDateFormat sdf_dia = new SimpleDateFormat("dd");
        SimpleDateFormat sdf_mes = new SimpleDateFormat("MM");
        SimpleDateFormat sdf_ano = new SimpleDateFormat("yyyy");
        Date data = new Date();

        //Variaveis
        int idade;
        int modelo = 18;
        int dia_atual = Integer.parseInt(sdf_dia.format(data).toString());
        int mes_atual = Integer.parseInt(sdf_mes.format(data).toString());
        int ano_atual = Integer.parseInt(sdf_ano.format(data).toString());

        idade = ano_atual - ano;
        
        if (mes_atual < mes){
            idade -= 1;
        }else if ((mes_atual == mes )&&(dia_atual < dia)){
            idade -= 1;
        }
        
        //Verificação
        if (idade < modelo){
            return "Menor";
        }else{
            return "Maior";
        }
    }

    
    
    
}