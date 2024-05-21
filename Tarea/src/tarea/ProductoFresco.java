package tarea;

import java.util.Scanner;

public class ProductoFresco extends Producto {

    String organismoDesupervisionAlimentario;

    public ProductoFresco(){

    }

    public ProductoFresco(String fechaCaducidad, int numeroLote, float temperaturaRecomendada){
        super(fechaCaducidad, numeroLote);
        this.organismoDesupervisionAlimentario = organismoDesupervisionAlimentario;

    }

    public  String GetorganismoDesupervisionAlimentario(){
        return organismoDesupervisionAlimentario;
    }

    public void SetorganismoDesupervisionAlimentario(){
        this.organismoDesupervisionAlimentario = organismoDesupervisionAlimentario;
    }

    public void RegistrarProductoFresco(){
        Scanner RegistrarProductoFresco = new Scanner(System.in);

        System.out.println("Registrar producto fresco. ");
        System.out.print("Ingrese organismo que supervisa el producto: ");
        organismoDesupervisionAlimentario = RegistrarProductoFresco.next();
        System.out.println("El organismo encargado de supervisar es : " +GetorganismoDesupervisionAlimentario());

        System.out.println("El número de lote del producto es: " + GetnumeroLote());

        System.out.println("La fecha de caduidad del producto es: " + GetfechaCaducidad());

        System.out.println();


    }
}

