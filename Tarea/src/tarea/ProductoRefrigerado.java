package tarea;

import java.util.Scanner;

public class ProductoRefrigerado extends Producto{

    String fechaEnvasado;
    String paisOrigen;

    public ProductoRefrigerado(){
    }

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, float temperaturaRecomendada){
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this. paisOrigen = paisOrigen;
    }

    public String GetFechaEnvasado(){
        return "05/11/2025";
    }

    public void SetfechaEnvasado(){
        this.fechaEnvasado = fechaEnvasado;
    }

    public String GetpaisOrigen(){
        return paisOrigen;
    }

    public void SetpaisOrigen(){
        this.paisOrigen = paisOrigen;
    }

    public void RegistrarProductoRefrigerado(){
        Scanner RegistrarProductoRefrigerado = new Scanner(System.in);

        System.out.println("Registrar producto refrigerado. ");

        System.out.println("La fecha de envasado es de : " +GetFechaEnvasado());

        System.out.print("Ingrese el país de origen del producto: ");
        paisOrigen = RegistrarProductoRefrigerado.next();
        System.out.println("El país origen es: " +GetpaisOrigen());


        System.out.println("El número de lote del producto es: " + GetnumeroLote());

        System.out.println("La fecha de caduidad del producto es: " + GetfechaCaducidad());

        System.out.println();


    }
}
