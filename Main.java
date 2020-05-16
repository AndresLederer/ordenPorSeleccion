package ordenPorSeleccion;

public class Main {
	public static void main (String[] args) {
		//inicializo array
		double [] numeros = {1,3,1.5,11,-2,8,100,9,9};
		//orden por seleccion
		ordenarArrayInt(numeros);
		//muestro el array ordenado
		mostrararregloDouble(numeros);
	}
	
	//recibe un array double y lo ordena
	private static void ordenarArrayInt(double [] arregloDouble) {
		int posicionDelMenor;
		double aux;
		int i = 0;
		
 		while(i < arregloDouble.length) {
			posicionDelMenor = getPosicionDelMenor(arregloDouble,i);
			aux = arregloDouble[posicionDelMenor];
			arregloDouble[posicionDelMenor] = arregloDouble[i];
			arregloDouble[i] = aux;
			i++;
		}
	}
	
	//recibe un array double y busca la posicion del menor numero a partir de la posicion pasada en el segundo parametro
	//devuelve la posicion del menor numero
	private static int getPosicionDelMenor(double [] arregloDouble, int posicionActual) {
		double menor = arregloDouble[posicionActual];
		int posicionDelMenor = posicionActual;
		int nextIndex = posicionActual + 1;
		
		while(nextIndex < arregloDouble.length) {
			if(menor > arregloDouble[nextIndex]) {
				menor = arregloDouble[nextIndex];
				posicionDelMenor = nextIndex;
			}
			nextIndex++;
		}
		
		return posicionDelMenor;
	}
	
	//recibe un array double y lo muestra por cmd
	private static void mostrararregloDouble(double[] arregloDouble) {
		for (double numero : arregloDouble) {
			System.out.println(String.format("%.2f",numero));
		}
	}
}
