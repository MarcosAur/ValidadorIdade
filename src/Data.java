import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

    public static String ValidarIdade(int dia,int mes,int ano){
        //Objeto
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();

        //Variaveis
        int atual[] = new int[3];
        int valor;
        int contador = 0;
        int idade;
        int modelo = 18;
        String data_formatada;
        String[] data_dividida;
        
        //Inicio
        data_formatada = formatar.format(data);
        data_dividida = data_formatada.split("/");
        
        //Construção do vetor Data Atual(separada)
        while(contador < 3){
            valor = Integer.parseInt(data_dividida[contador]);
            atual[contador] = valor;
            contador++;
        }
        
        idade = atual[2] - ano;
        
        if (atual[1] < mes){
            idade -= 1;
        }else if ((atual[1] == mes )&&(atual[0] < dia)){
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