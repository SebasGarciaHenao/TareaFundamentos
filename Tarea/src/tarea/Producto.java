package tarea;

public class Producto {

    public String fechaCaducidad;
    public int numeroLote;



    public Producto(){

    }


    public Producto( String fechaCaducidad, int numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;

    }



    public void SetfechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;

    }

    public String GetfechaCaducidad(){
        return "03/12/2025";
    }

    public void SetnumeroLote(int numeroLote){
        this.numeroLote = numeroLote;
    }

    public int GetnumeroLote(){
        return 45675556;
    }


    public static void  main (String[] args){

        ProductoCongelador Con = new ProductoCongelador();

        Con.RegistrarProductoCongelador();

        ProductoFresco Fres = new ProductoFresco();
        Fres.RegistrarProductoFresco();

        ProductoRefrigerado Re = new ProductoRefrigerado();
        Re.RegistrarProductoRefrigerado();

    }

}
