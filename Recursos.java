public class Recursos {
    public String Mensaje() {
        return "Programacion Orientada a Objetos";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Es Mayor de edad";
        } else {
            return "Es Menor de edad";
        }
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}


