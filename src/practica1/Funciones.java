/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author hp
 */
public class Funciones {
    
    //Se muestra el menu en pantalla
    public void Presentacion(){
        System.out.println("Practica #1");
        System.out.println("Pruebas de software \n");
        
        System.out.println("MENU");
        System.out.println("1. Para ingresar 3 lados");
        System.out.println("2. Para ingresar 4 lados");
        System.out.println("3. Para salir del menu \n");
    }
    
    //Se valida la opcion que escoge el usuario (1,2 o 3)
    public boolean esValida(String option){   
        int opt;
        try{
            opt = Integer.parseInt(option); 
        }catch(Exception e){
            System.out.println("La opcion debe corresponder a un valor numerico");
            return false;
        }
        
        if( (opt==1)||(opt==2)||(opt==3) ){
            return true;
        }
        
        System.out.println("Debe digitar un numero asociado a alguna opcion del menu");
        return false;
    }
    
    //Se valida el ingreso de un valor correcto para el lado
    public boolean esLadoValido(String l){
        float lado;
        
        try{
            lado = Float.parseFloat(l); 
        }catch(Exception e){
            System.out.println("Se debe ingresar un numero real");
            return false;
        }       
        
        if(lado<=0){
            System.out.println("Se debe ingresar un numero real positivo");
            return false;
        }
        return true;
    }
    
    //Tres lados iguales
    public boolean esEquilatero(float la, float lb, float lc){
        if((la==lb)&&(la==lc)){
            return true;
        }
        return false;
    }
    
    //Dos lados iguales
    public boolean esIsosceles(float la, float lb, float lc){
        if((la==lb)||(la==lc)||(lb==lc)){
            return true;
        }
        return false;
    }    
    
    //Todos los lados diferentes
    public boolean esEscaleno(float la, float lb, float lc){
        if((la!=lb)&&(la!=lc)&&(lb!=lc)){
            return true;
        }
        return false;
    }     
    
}
