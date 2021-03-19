/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author default
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int ValidarIdade(Data d){
        int idade = d.ano - this.ano;
        if (d.mes < this.mes){
            idade -=1 ;
        }else if ((d.mes == this.mes )&&(d.dia > this.dia)){
            idade -= 1;
        }
        return idade;
    }

    
    
    
}
