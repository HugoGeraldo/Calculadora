/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

/**
 *
 * @author Jefferson
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1=10,n2=10;
        Soma testesoma= new Soma();
        Multiplicacao testemutiplicacao = new Multiplicacao();
        testesoma.soma(n1,n2);
        testemutiplicacao.multiplicacao(n1,n2);
        
        
    }
    
}
