package tarea;

import java.util.Scanner;

public class ProductoCongelador extends Producto {

    private float temperaturaRecomendada;

    public ProductoCongelador(){

    }
    public ProductoCongelador(String fechaCaducidad, int numeroLote, float temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public float GettemperaturaRecomendada(){
        return temperaturaRecomendada;
    }

    public void SettemperaturaRecomendada(){
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void RegistrarProductoCongelador(){

        Scanner RegistrarProductoCongelador = new Scanner(System.in);

        System.out.println("Registrar  producto del congelador. ");
        System.out.print("Ingrese la temperatura de congelación recomendada del producto: ");
        temperaturaRecomendada = RegistrarProductoCongelador.nextFloat();
        System.out.println("La temperatura del producto es de: " +GettemperaturaRecomendada()+ " grados.");

        System.out.println("El número de lote del producto es: " + GetnumeroLote());

        System.out.println("La fecha de caduidad del producto es: " + GetfechaCaducidad());

        System.out.println();


    }
}


