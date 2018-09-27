package practica1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Practica1 {

    
    public static void main(String[] args) throws InterruptedException {
        // Se instancia la clase Funciones
        Funciones fc = new Funciones();   
        //Se lee la entrada del teclado
        Scanner sc = new Scanner(System.in);
        
        String opcion;
        int opcionInt=0;
        
        //El ciclo solo se rompe cuando el usuario o el mismo programa eligen la opcion salir (3)
        while(opcionInt!=3){
            
            
            fc.Presentacion();
        
            //El usuario escoge una opcion del menu
            System.out.print("Digite la opción: ");
            opcion = sc.nextLine();             
            //Se valida la entrada
            if(!fc.esValida(opcion)){   
                //En caso de entrada erronea
                System.out.print("Digite nuevamente la opción: ");
                opcion = sc.nextLine();
            }else{                
                //Ingresa como opcion valida
                
                //Se requiere saber que opcion es (1,2 o 3)
                opcionInt=Integer.parseInt(opcion);
                
                if(opcionInt==1){ //3 lados
                    
                    //Los string nos ayudan a validar la entrada, los float guardan el valor
                    String ladoa, ladob, ladoc;
                    float a,b,c;
                    
                    //Lado 1
                    System.out.print("Digite el lado #1: ");
                    ladoa=sc.nextLine();
                    while(!fc.esLadoValido(ladoa)){
                        System.out.print("Digite nuevamente el lado #1");
                        ladoa = sc.nextLine();
                    }
                    a = Float.parseFloat(ladoa);
                    
                    //Lado 2
                    System.out.print("Digite el lado #2: ");
                    ladob=sc.nextLine();
                    while(!fc.esLadoValido(ladob)){
                        System.out.print("Digite nuevamente el lado #2");
                        ladob = sc.nextLine();
                    }
                    b = Float.parseFloat(ladob);

                    //Lado 3
                    System.out.print("Digite el lado #3: ");
                    ladoc=sc.nextLine();
                    while(!fc.esLadoValido(ladoc)){
                        System.out.print("Digite nuevamente el lado #3");
                        ladoc = sc.nextLine();
                    }
                    c = Float.parseFloat(ladoc);    
                    
                    //Teniendo los 3 lados del triangulo, se define que tipo es
                    if(fc.esEquilatero(a,b,c)){
                        System.out.println("Es un triangulo equilatero \n");
                        Thread.sleep(3000); //Pausa de 3 segundos
                    }else if(fc.esIsosceles(a,b,c)){
                        System.out.println("Es un triangulo isosceles \n");
                        Thread.sleep(3000); //Pausa de 3 segundos
                    }     
                    if(fc.esEscaleno(a,b,c)){
                        System.out.println("Es un triangulo escaleno \n");    
                        Thread.sleep(3000); //Pausa de 3 segundos
                    }                    
                }
                
                if(opcionInt==2){  //4 lados
                    
                }
                
                if(opcionInt==3){  //Opcion Salir
                    System.out.println("Saliendo del sistema...");
                    Thread.sleep(5000); //Pausa de 5 segundos
                }
                                
            }

        }
     
        
    }
    
}
