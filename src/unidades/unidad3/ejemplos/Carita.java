package unidades.unidad3.ejemplos;

public class Carita {

    public static void main(String[] args) {

        for(int i=1;i<=7;i++){

            for(int j=1;j<=10;j++){

                if(
                        (i==1 && (j==3 || j==4 || j==5 || j==6 || j==7 || j==8))
                        ||(i==2 && (j==2 || j==9))
                        ||(i==3 && (j==1 || j==4|| j==7 || j==10))
                        ||(i==4 && (j==1 || j==5|| j==6 || j==10))
                        ||(i==5 && (j==1 || j==4|| j==5 || j==6 || j==7 || j==10))
                        ||(i==6 && (j==2 || j==9))
                        ||(i==7 && (j==3 || j==4 || j==5 || j==6 || j==7 || j==8))
                  )

                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
