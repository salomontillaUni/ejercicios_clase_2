import java.util.ArrayList;
import java.util.List;

// Hecho por Salomon Montilla Luna
public class EjerciciosListas {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1: ------");
        List<Integer> listaPotencia = List.of(2, 3, 4);
        List<Integer> resultadoListaPotencia = listaPotencia(2, listaPotencia);
        System.out.println("Resultado de la potencia: " + resultadoListaPotencia);


        //Ejercicio 2
        System.out.println("Ejercicio 2: ------");
        List<Integer> listaMulti = List.of(2, 4, 6);
        List<Integer> listaMulti2 = List.of(3, 5, 7);

        List<Integer> resultadoMultiplicacion = listasMultiplicacion(listaMulti, listaMulti2);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        //Ejercicio 3 - Salomon Montilla
        System.out.println("Ejercicio 3: ------");
        List<Integer> listaPromedio = List.of(2, 4, 6, 8, 10);
        double resultadoPromedio = calcularPromedio(listaPromedio);
        System.out.println("Resultado del promedio: " + resultadoPromedio);

    }
    //Ejercicio 1
    public static List<Integer> listaPotencia(int exponente, List<Integer> numeros){
        List<Integer> nuevaLista = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            nuevaLista.add(i, (int) Math.pow(numeros.get(i), exponente));
        }
        return nuevaLista;
    }
    //Ejercicio 2
    public static List<Integer> listasMultiplicacion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();

        if (lista1.size() != lista2.size()) {
            System.out.println("Las listas deben tener el mismo tamaño!");
            return null;
        }

        for (int i = 0; i < lista1.size(); i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }

        return resultado;
    }

    //ejercicio 3
    public static double calcularPromedio(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }

        return (double) suma / lista.size();
    }

}





