import java.util.ArrayList;
import java.util.List;

// Hecho por Salomon Montilla Luna
public class EjerciciosListas {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1: ------");
        List<Integer> listaPotencia = List.of(2, 3, 4);
        System.out.println("Lista original: " + listaPotencia);
        List<Integer> resultadoListaPotencia = listaPotencia(2, listaPotencia);
        System.out.println("Resultado de la potencia: " + resultadoListaPotencia);

        //Ejercicio 2
        System.out.println("Ejercicio 2: ------");
        List<Integer> listaMulti = List.of(2, 4, 6);
        List<Integer> listaMulti2 = List.of(3, 5, 7);

        System.out.println("Lista 1: " + listaMulti);
        System.out.println("Lista 2: " + listaMulti2);

        List<Integer> resultadoMultiplicacion = listasMultiplicacion(listaMulti, listaMulti2);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        //Ejercicio 3 - Salomon Montilla
        System.out.println("Ejercicio 3: ------");
        List<Integer> listaPromedio = List.of(2, 4, 6, 8, 10);
        System.out.println("Lista original: " + listaPromedio);
        double resultadoPromedio = calcularPromedio(listaPromedio);
        System.out.println("Resultado del promedio: " + resultadoPromedio);

        //Ejercicio 4, 5, 6, 7 - Salomon Montilla
        List<Integer> lista = List.of(3, 1, 4, 1, 5, 9, 2);
        List<Integer> lista2 = List.of(10, 20, 30);
        System.out.println("Lista 1 original: " + lista);
        System.out.println("Lista 2 original: " + lista2);
        
        System.out.println("Ejercicio 4: ------");
        System.out.println("Lista invertida: " + invertirLista(lista));
        System.out.println("Ejercicio 5: ------");
        System.out.println("Lista sin duplicados: " + eliminarDuplicados(lista));
        System.out.println("Ejercicio 6: ------");
        System.out.println("¿Lista ordenada? " + estaOrdenada(lista));
        System.out.println("Ejercicio 7: ------");
        System.out.println("Lista combinada: " + combinarListas(lista, lista2));

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

    //ejercicio 4
    public static List<Integer> invertirLista(List<Integer> lista) {
        List<Integer> listaInvertida = new ArrayList<>(lista);
        for (int i = 0; i < lista.size(); i++) {
            listaInvertida.set(i, lista.get(lista.size() - 1 - i));
        }
        return listaInvertida;
    }

    //ejercicio 5

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        List<Integer> listaSinDuplicados = new ArrayList<>();

        for (int num : lista) {
            if (!listaSinDuplicados.contains(num)) {
                listaSinDuplicados.add(num);
            }
        }

        return listaSinDuplicados;
    }

    //ejercicio 6
    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    //ejercicio 7
    private static List<Integer> combinarListas(List<Integer> lista, List<Integer> lista2) {
        List<Integer> listaCombinada = new ArrayList<>();
        for (int num : lista) {
            listaCombinada.add(num);
        }

        for (int num : lista2) {
            listaCombinada.add(num);
        }
        return listaCombinada;
    }



}





