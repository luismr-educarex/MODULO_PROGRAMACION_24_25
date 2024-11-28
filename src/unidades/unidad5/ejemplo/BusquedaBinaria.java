package unidades.unidad5.ejemplo;

public class BusquedaBinaria {

    public static void main(String[] args) {

        int elementos[] = {3,4,5,12,27,28,45,53,90,97,276};

        boolean resultadoBusqueda = buscarBinario(elementos,97);

        if(!resultadoBusqueda){
            System.out.println("NO ENCONTRADO");
        }else{
            System.out.println("Encontrado");
        }

    }

    static boolean buscarBinario(int array[],int elemento){

        boolean encontrado = false;
        int izquierda=0, derecha = array.length-1;

        while(izquierda<=derecha && !encontrado){
            int medio = (izquierda + derecha)/2;
            //compobar si el elemento es el medio
            if(array[medio]==elemento){
                encontrado=true;
            }
            //preguntamos si es mayor, me quedo con la parte derecha
            else if(array[medio]<elemento){
                izquierda=medio+1;
            }//Si es menor me quedo con la parte izquierda
            else{
                derecha=medio-1;
            }

        }


        return encontrado;
    }

}
