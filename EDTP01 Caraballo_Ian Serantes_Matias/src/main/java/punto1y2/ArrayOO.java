package punto1y2;

public class ArrayOO {

    private int[] array;

    /**
     * Inicializa un array sin posiciones.
     */
    public ArrayOO() {
        this.array = new int[0];
    }

    /**
     * Incrementa en uno la longitud del array e inserta en la última posición
     * el valor pasado por parámetro
     *
     * @param valor
     */
    public void add(int valor) {
        //Crear nuevoArray con length = array.length + 1
        int[] nuevoArray = new int[array.length + 1];
        //Copiar los valores de array en otro array nuevoArray
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        //Poner el nuevo valor en nuevoArray 
        nuevoArray[nuevoArray.length - 1] = valor;
        //Sobreescribir el valor de array
        this.array = nuevoArray;
    }

    /**
     * Quita el elemento ubicado en la posición especificada por el parámetro y
     * disminuye en uno la longitud del array.
     *
     * @param indice
     */
    public void remove(int indice) {
        //Crear nuevoArray con length = array.length - 1
        int[] nuevoArray = new int[array.length - 1];

        //Copiar todos los valores menos indice
        int indiceAux = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indice) {
                nuevoArray[indiceAux] = array[i];
                indiceAux++;
            }
        }

        //Sobreescribir el array con nuevoArray
        this.array = nuevoArray;
    }

    /**
     * Obtiene el valor especificado por índice
     *
     * @param indice
     * @return
     */
    public int get(int indice) {
        return array[indice];
    }

    /**
     * Establece el valor pasado por parámetro en la posición especificada por
     * indice
     *
     * @param indice
     * @param valor
     */
    public void set(int indice, int valor) {
        this.array[indice] = valor;
    }

    /**
     * Devuelve la cantidad de posiciones actual de la estructura.
     *
     * @return
     */
    public int size() {
        return this.array.length;
    }

    /**
     * Concatena en un único String todos los valores de la estructura
     *
     * @return
     */
    @Override
    public String toString() {
        String resultado = "";

        for (int actual : array) {
            resultado += actual + ",";
        }

        if (resultado.length() > 0) {
            resultado = resultado.substring(0, resultado.length() - 1) + ".";
        }

        return resultado;
    }

    public double promedio() {
        double total = 0;
        for (int i = 0; i < this.array.length; i++) {
            total += this.array[i];
        }

        return total / this.array.length;
    }

    public void multiplicar(int valorParam) {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] * valorParam;
        }
    }

    public void multiplicar(int[] arrayParam) {
        if (arrayParam.length <= this.array.length) {
            for (int i = 0; i < arrayParam.length; i++) {
                this.array[i] = this.array[i] * arrayParam[i];
            }

        } else {
            for (int i = 0; i < arrayParam.length; i++) {
                if (i <= this.array.length - 1) {
                    this.array[i] = this.array[i] * arrayParam[i];
                } else {
                    this.array[i - this.array.length] = this.array[i - this.array.length] * arrayParam[i];
                }

            }
        }
    }

    public boolean todosDistintos() {

        for (int i = 0; i < this.array.length - 1; i++) {
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[i] == this.array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reverso() {
        for (int i = 0; i < this.array.length / 2; i++) {
            int temp = this.array[i];
            this.array[i] = this.array[this.array.length - 1 - i];
            this.array[this.array.length - 1 - i] = temp;
        }
    }

}
