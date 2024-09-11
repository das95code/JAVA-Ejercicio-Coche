/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Coche {
        //Creamos los atributos para la clase Coche.
        String marca;
        String modelo;
        String bastidor;
        String matricula;
        int kms;
        int potencia;
        int cc;
        int deposito;
        int nplazas;
        int velocidadActual;
        int consumoActual;
        int alante;
        int girar;
        
        //Creamos los métodos para la clase Coche.
        //Primero, creamos el método constructor.
        public Coche(String marca, String modelo, String bastidor, String matricula, int kms, int potencia, int cc, int deposito, int nplazas, int velocidadActual, int consumoActual){
            this.marca = marca;
            this.modelo = modelo;
            this.bastidor = bastidor;
            this.matricula = matricula;
            this.kms = kms;
            this.potencia = potencia;
            this.cc = cc;
            this.deposito = deposito;
            this.nplazas = nplazas;
            this.velocidadActual = velocidadActual;
            this.consumoActual = consumoActual;
        }
        
        //Con el método mostrar datos, mostraremos los diferentes atributos asignados al objeto de la clase Coche.
        public void mostrarDatos(){
            System.out.println("\nEl coche es un " + marca + " " + modelo);
            System.out.println("Su número de bastidor es " + bastidor + " y su matrícula es " + matricula);
            System.out.println("Tiene " + kms + " kilometros, " + " una potencia de " + potencia + " CV, una cilindrada de " + cc + " cc., un depósito de " + deposito + " litros, y " + nplazas + " plazas.\n");
        }
        
        //Método arrancar.
        public void arrancar(){
            System.out.println("\nBrooooom\n");
        }
        
        //Con el método avanzar, pintaremos por pantalla un String u otro dependiendo del valor que tome el atributo "alante".
        public void avanzar(){
            if (alante == 1){
                System.out.println("\nMetemos primera y avanzamos.\n");
            }
            else if (alante == 0){
                System.out.println("\nMetemos marcha atrás.\n");
            }
        }
        
        //Método acelerar.
        public void acelerar(){
            System.out.println("\nAceleramos hasta coger una velocidad de " + velocidadActual + " km/h.\n");
        }
        
        //Método frenar.
        public void frenar(){
            System.out.println("\nFrenamos.\n");
        }
        
        //Método consumir.
        public void consumir(){
            System.out.println("\nEl consumo medio actual es de " + consumoActual + " litros.\n");
        }
        
        //El método girar funciona de la misma forma que el método avanzar.
        public void girar(){
            if (girar == 1){
                System.out.println("\nGiramos a la derecha.\n");
            }
            else if (girar == 0){
                System.out.println("\nGiramos a la izquierda.\n");
            }
        }
        
                
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos, utilizando el método constructor, un objeto "coche1" de la clase Coche, y le damos valores a sus atributos.
        Coche coche1 = new Coche("Seat", "Ibiza", "EVGZZZ5MYJE1456423", "4839DFZ", 40000, 120, 1200, 50, 5, 100, 7);
     
        //Creamos un menú con el que, según la opción, ejecutará uno u otros métodos.
        int menu = 0;
        while (menu!= 8){  //Se repetirá el menú mientras el valor seleccionado de nuestro menú no sea 8.    
        
        System.out.println("¡Bienvenido al menú del coche! Elige una opción: ");
        System.out.println("1. Mostrar datos del coche.");
        System.out.println("2. Arrancar vehículo.");
        System.out.println("3. ¿Avanzar o retroceder?");
        System.out.println("4. Acelerar.");
        System.out.println("5. Frenar.");
        System.out.println("6. Mostrar consumo medio del vehículo.");
        System.out.println("7. Función girar, ¿hacia la derecha o hacia la izquierda?");
        System.out.println("8. Detener el vehículo (finalizar programa).\n");
       
        Scanner sc = new Scanner(System.in);  //Creamos un nuevo objeto de la clase scanner...
        menu = sc.nextInt();   // ... que nos servirá para movernos por el menú.
            
            switch(menu){   //Con un switch iremos seleccionando los distintos case en función de la opción que hayamos elegido.
                case 1: 
                        coche1.mostrarDatos(); //En el case 1, ejecutaremos el método "mostrarDatos" para el objeto "coche1".
                        break;  //Un break al final de cada case nos ahorrará caer en cascada por todo el switch. En este caso no necesitaremos
                                //más comprobaciones. Terminamos el case, reiniciamos el bucle y volvemos al menú.
                        
                case 2: //En el case 2, ejecutamos el método arrancar..
                        coche1.arrancar();
                        break;
                        
                case 3: //El case 3 se utiliza para la opción "¿avanzar o retroceder?".
                        int modo = 7;
                        while (modo != 0 | modo != 1){  //Con un bucle while, pediremos por pantalla un comando de teclado.
                        System.out.println("\nIntroduce '1' si metemos primera, '0' si metemos marcha atrás.\n");
                        Scanner sc2 = new Scanner(System.in);
                        modo = sc2.nextInt();
                            if (modo == 0){   //Si el comando introducido es 0...
                                coche1.alante = 0; //El valor del atributo "alante" de coche1 valdrá 0, lo que ocasionará que el método "avanzar" saque por pantalla "marcha atras".
                                break;
                            }
                            else if (modo == 1){ //De la misma forma, si el comando introducido es 1...
                                coche1.alante = 1; //Elv alor del atributo "alante de coche1 valdrá 1, y el método "avanzar" sacará por pantalla "ponemos la primera marcha".
                                break;
                            }
                            else{
                                System.out.println("\nNo has introducido un comando válido.\n");  //Si los comandos introducidos no son ni 1 ni 0, los volverá a pedir.
                            }
                        }
                        coche1.avanzar(); //Finalmente, y habiendo dado un valor al atributo "alante", se ejecutará el método en base a ese valor.
                        break;
                        
                case 4: //Método acelerar.
                        coche1.acelerar();
                        break;
                        
                case 5: //Método frenar.
                        coche1.frenar();
                        break;
                        
                case 6: //Método consumir.
                        coche1.consumir();
                        break;
                        
                case 7: //El case 7 funciona exactametne igual que el case 3. En este caso, si el atributo girar vale 0, giraremos a la izquierda, y si vale 1, giraremos a la derecha.
                        int modo2 = 7;
                        while (modo2 != 0 | modo2 != 1){
                        System.out.println("\nIntroduce '1' si giramos a la derecha, '0' si giramos a la izquierda.\n");
                        Scanner sc3 = new Scanner(System.in);
                        modo2 = sc3.nextInt();
                            if (modo2 == 0){
                                coche1.girar = 0;
                                break;
                            }
                            else if (modo2 == 1){
                                coche1.girar = 1;
                                break;
                            }
                            else{
                                System.out.println("\nNo has introducido un comando válido.\n");
                            }
                        }
                        coche1.girar(); //El método se ejecutará teniendo en cuenta el valor dado al atributo.
                        break;
                
                case 8: 
                        System.out.println("\nDetenemos el vehículo y sacamos el contacto. ¡Hasta luego!\n");  //El case 8 no es ningún método, si no la opción utilizada para finalizar el programa.
                        break;
                        
                default: //La opción por defecto. Saldrá por pantalla cuando introduzcamos un valor erróneo.
                        System.out.println("\nNo has introducido ningún valor válido. Prueba otra vez.\n");
                
            }
        
        }
        
        
    }
    
}
