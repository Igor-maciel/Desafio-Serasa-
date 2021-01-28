/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Master
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    private static String nome;
  
   
    
    public static void main(String[] args) throws IOException {
       Scanner leitor = new Scanner (System.in);
        /**
     * Gabarito do professor,onde ele armeza as respostas certas
     */
        
         int x = 0;
         System.out.println("Prova");
         System.out.println("--------");
         System.out.println("Gabarito da Prova");
         System.out.println("Digite qual será alternativa certa para cada questao");
          System.out.println("A,B,C ou D");
           System.out.println("");
         
         System.out.println(" Resposta: Questao 1");
         String respostaCerta1 = leitor.next();
         System.out.println("");
         
          System.out.println("Resposta: Questao 2");
        String respostaCerta2 = leitor.next();
         System.out.println("");
         
         System.out.println("Resposta: Questao 3");
        String respostaCerta3 = leitor.next();
         System.out.println("");
         
         System.out.println("Resposta: Questao 4");
        String respostaCerta4 = leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 5");
        String respostaCerta5 = leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 6");
        String respostaCerta6 = leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 7");
         String respostaCerta7 = leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 8");
        String respostaCerta8 = leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 9");
        String respostaCerta9 =leitor.next();
         System.out.println("");
         
           System.out.println("Resposta: Questao 10");
        String respostaCerta10 = leitor.next();
         System.out.println("");
         
          System.out.println("-------");
        
        do { 
         String aprovado;
         float nota;
         
                
        System.out.println("Digite o nome do Aluno");
        /**
     Tive que criar 2 leitor,porque sempre quando for executar ele deixar passar  next,por isso os 2.
     */
         nome = leitor.nextLine();
         nome = leitor.nextLine();
         
          System.out.println("");
        System.out.println("Questao 1");
        System.out.println("Digite a resposta do aluno:");
        String respostaAluno =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta1);
        System.out.println("pontuação da questão :");
        float quest1 = leitor.nextFloat();
        
        System.out.println("");
        
         System.out.println("Questao 2");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno2 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta2);
        System.out.println("pontuação da questão :");
        float quest2= leitor.nextFloat();
        
         System.out.println("");
        
         System.out.println("Questao 3");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno3 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta3);
        System.out.println("pontuação da questão :");
        float quest3 = leitor.nextFloat();
        
         System.out.println("");
        
         System.out.println("Questao 4");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno4 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta4);
        System.out.println("pontuação da questão :");
        float quest4 = leitor.nextFloat();
        
         System.out.println("");
        
         System.out.println("Questao 5");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno5 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta5);
        System.out.println("pontuação da questão :");
        float quest5 = leitor.nextFloat();
        
         System.out.println("");
        
         System.out.println("Questao 6");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno6 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta6);
        System.out.println("pontuação da questão :");
        float quest6 = leitor.nextFloat();
        
         System.out.println("");
        
        System.out.println("Questao 7");
        System.out.println("Digite a resposta do aluno:");
        String respostaAluno7 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta7);
        System.out.println("pontuação da questão :");
        float quest7 = leitor.nextFloat();
        
         System.out.println("");
        
          System.out.println("Questao 8");
          System.out.println("Digite a resposta do aluno:");
        String respostaAluno8=leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta8);
        System.out.println("pontuação da questão :");
        float quest8 = leitor.nextFloat();
        
         System.out.println("");
            
         System.out.println("Questao 9");
         System.out.println("Digite a resposta do aluno:");
        String respostaAluno9 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta9);
        System.out.println("pontuação da questão :");
        float quest9 = leitor.nextFloat();
        
         System.out.println("");
        
          System.out.println("Questao 10");
          System.out.println("Digite a resposta do aluno:");
        String respostaAluno10 =leitor.next();
        System.out.println("Resposta certa:"+ respostaCerta10);
        System.out.println("pontuação da questão :");
        float quest10 = leitor.nextFloat();
        System.out.println("");
        
        nota= quest1+quest2+quest3+quest4+quest5+quest6+quest7+quest8+quest9+quest10;
        System.out.println("Nota " +nota);
        
        if (nota > 7){
            System.out.println(nome + " Aprovado");
            
        }else {
            System.out.println(nome + " Reprovado");
        }
            System.out.println("");
            x++;
       
        } while (x < 1);
   
    }
    

}
