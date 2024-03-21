import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

            menu(); //se llama el menu para que corra


        }

    public static void menu(){

        Scanner x = new Scanner((System.in));

        int op;
        float a;
        float b;

        float sum, res, div, mult;

        System.out.println("---tu calcuadora----");

      do{
          System.out.println("Ingrese el primer numero");
          a = x.nextInt();
          System.out.println("Ingrese el segundo digito");
          b= x.nextInt();

          System.out.println("Elija un tipo de operacion:");
          System.out.println("1.Suma");
          System.out.println("2.resta");
          System.out.println("3.multiplcacion");
          System.out.println("4.division");
          System.out.println("5.salir");
          op = x.nextInt();


         switch (op)
         {
             case 1:

                 sum = suma(a,b);
                 System.out.println("Suma: "+ sum);
                 break;
             case 2:

                 res = Main.resta(a,b);
                 System.out.println("Suma: " + res);

                 break;
             case 3:

                 mult = Main.multiplicacion(a,b);
                 System.out.println("Suma: " + mult);

                 break;
             case 4:

                 div = Main.division(a,b);
                 System.out.println("Suma: " + div);

                 break;
             case 5:

                 System.out.println("Saliendo...");
                 break;
         }



      }while(op != 5);

    }

    public static float suma(float a, float b) {
        return a + b;

    }

    public static float resta(float a, float b) {
        return a - b;
    }

    public static float multiplicacion(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        if (b == 0) {

            System.out.println("no se puede dividir entre 0");
            return 0;
        } else {

            return a / b;
}
    }

    }



