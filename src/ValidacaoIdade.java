
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author default
 */

public class ValidacaoIdade {
    public static void main(String[] args) {
        //Objetos
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Data nascimento;
        Data atual;
        Scanner sc = new Scanner(System.in);

        //Variaveis
        String data_formatada;
        String[] data_dividida;
        int dia;
        int mes;
        int ano;
        int idade;
        int modelo = 18;
        
        //Inicio
        data_formatada = formatar.format(data);
        data_dividida = data_formatada.split("/");
        
        //Instanciação Data Atual
        dia = Integer.parseInt(data_dividida[0]);
        mes = Integer.parseInt(data_dividida[1]);
        ano = Integer.parseInt(data_dividida[2]);
        atual = new Data(dia, mes, ano);
        
        //Instanciação Data Nascimento
        System.out.println("Digite seu dia de nascimento: ");
        dia = sc.nextInt();
        System.out.println("Digite seu mes de nascimento: ");
        mes = sc.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        ano = sc.nextInt();
        nascimento = new Data(dia, mes, ano);
        idade = nascimento.ValidarIdade(atual);
        
        if (idade < modelo){
            System.out.println("Menor");
        }else{
            System.out.println("Maior");
        }
        
        
        sc.close();
    }
    
}
