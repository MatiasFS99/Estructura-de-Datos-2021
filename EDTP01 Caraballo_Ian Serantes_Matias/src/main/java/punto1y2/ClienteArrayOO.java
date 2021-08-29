package punto1y2;

public class ClienteArrayOO {

	public static void main(String[] args) {
		ArrayOO array1 = new ArrayOO();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);
		array1.add(6);
		array1.add(7);
		array1.add(8);
		array1.add(9);
		array1.add(10);
		System.out.println("----------------Listado de valores----------------");
		System.out.println(array1);
		System.out.println("---------------Promedio de valores----------------");
		System.out.println("El promedio de los elementos del arreglo es: " +array1.promedio());
		System.out.println("----------Multiplicacion por parametro 2----------");
		array1.multiplicar(2);
		System.out.println("Multiplicado por parametro: " +array1);
		System.out.println("------------Multiplicacion por vector-------------");
		int vector[]= {2,3,4};
		array1.multiplicar(vector);
		System.out.println(array1);
		System.out.println("--------------Diferencia y Invertido--------------");
		System.out.println("Todos los elementos del arreglo son distintos: " +array1.todosDistintos());
		array1.reverso();
		System.out.println("El arreglo invertido es: "+array1);

	}

}

