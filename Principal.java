
public class Principal {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        String mensajePOO = recursos.Mensaje();
        System.out.println("Primer metodo: " + mensajePOO);

        int edad = 20;
        String resultadoEdad = recursos.verificarEdad(edad);
        System.out.println("Segundo metodo (Edad: " + edad + "): " + resultadoEdad);

        int num1 = 5;
        int num2 = 3;
        int resultadoMult = recursos.multiplicar(num1, num2);
        System.out.println("Tercer metodo: Multiplicacion de " + num1 + " y " + num2 + " = " + resultadoMult);
        
        int x = 10;
        int[] listaNum = recursos.generarLista(x);
        System.out.print("Cuarto metodo: Lista de numeros del 1 al " + x + ": ");
        for (int numero : listaNum) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
