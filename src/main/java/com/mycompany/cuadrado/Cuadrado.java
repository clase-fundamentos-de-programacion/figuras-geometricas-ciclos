package com.mycompany.cuadrado;

import java.util.Scanner;


public class Cuadrado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número de filas");
        int filas = lector.nextInt();
        System.out.println("Ingrese el número de columnas");
        int columnas = lector.nextInt();

        for(int y=0; y<filas; y++){
            // for(int i=1; i<=10; i++){ // 1 2 3 4 5 6 7 8 9 10
            for(int x=0; x<columnas; x++){     // 0 1 2 3 4 5 6 7 8 9
                if(x== 0 || y == 0 || y == filas-1 || x == columnas-1){
                    System.out.print(1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
