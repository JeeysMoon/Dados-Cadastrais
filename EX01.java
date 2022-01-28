
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jennifer
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, sobrenome, logradouro, numero, bairro, cep, cidade ,Estado;
        Scanner leitor = new Scanner (System.in);
        
        System.out.print(" Qual o seu Nome? ");
        nome = leitor.next ();
        System.out.print("\nSobrenome? ");
        sobrenome = leitor.next ();
        System.out.print("\nQual o nome da rua? ");
        logradouro = leitor.next ();
        System.out.print("\nE o número? ");
        numero = leitor.next ();
        System.out.print("\nEm qual bairro você mora? ");
        bairro = leitor.next ();
        System.out.print("\nQual é o CEP? ");
        cep = leitor.next ();
        System.out.print("\nA Cidade? ");
        cidade = leitor.next ();
        System.out.print("\nO Estado? ");
        Estado = leitor.next ();
              
        System.out.print("\nOlá "+nome+ " "+sobrenome+ " que mora no endereço: " +logradouro+", "+numero+","+bairro+" "+cep+" "+cidade+" "+Estado);
        
                
    }
    
}
