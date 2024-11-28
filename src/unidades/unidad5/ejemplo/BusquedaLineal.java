package unidades.unidad5.ejemplo;

public class BusquedaLineal {

    public static void main(String[] args) {

        int elementos[] = {3,4,5,12,27,28,45,53,90,97,276};

        boolean resultadoBusqueda = buscar(elementos,101);

        if(!resultadoBusqueda){
            System.out.println("NO ENCONTRADO");
        }else{
            System.out.println("Encontrado");
        }

    }

    static boolean buscar(int array[],int elemento){

        boolean encontrado=false;
        for(int i=0;i<array.length && !encontrado;i++){
            System.out.println("Voy a preguntar por el elmento "+i);
            if(array[i]==elemento){
                encontrado=true;
                System.out.println("¡¡¡¡¡Encontrado!!!!!");
            }
        }

        return encontrado;
    }

}
