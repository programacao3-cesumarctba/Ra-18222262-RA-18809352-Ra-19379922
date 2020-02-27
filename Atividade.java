/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;

import java.util.Scanner;

/**
 *
 * @author diova
 */
public class Atividade {
    Scanner scanf = new Scanner(System.in);

    public Atividade() {
    }
    
    
    public void atividade1(){
        int numero;
        
        System.out.println("Digite um numero");
        numero = scanf.nextInt();
        
        if(numero%2 == 1){
            System.out.println("O numero é impar: " + numero);
        } else{
            System.out.println("O numero é par: "+ numero);
        }
       
           }
    
    public void atividade2(){
        
        int numero;
        
        System.out.println("Digite um numero");
        numero = scanf.nextInt();
        
        if(numero%2 == 1){
            System.out.println("Estranho");
        } else if(numero<10){
            System.out.println("Não é estranho");
        }else if(numero>=10 && numero <=20){
            System.out.println("Estranho");
       }else if(numero>20){
           System.out.println("Não é estranho");
       }
    }
    
    public void atividade3(){
        int numero;
        int fatorial;
        int total=0;
        
        System.out.println("Digite um numero");
        numero = scanf.nextInt();
         System.out.println("Digite um fatorial");
        fatorial = scanf.nextInt();
        
            
        for(int i =0;i<fatorial;i++){
            total += numero*numero;
        }
        System.out.println("Numero: "+numero);
        System.out.println("Fatorial: "+fatorial);
        System.out.println("Resultado: "+total);
        
    }
    
    public void atividade4(){
         int numero;
        
        System.out.println("Digite um numero");
        numero = scanf.nextInt();
        for(int i=1; i<11;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
    }
    
}
