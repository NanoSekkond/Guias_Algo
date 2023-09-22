package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 0;
    private int[] vector;

    public VectorDeInts() {
        vector = new int[CAPACIDAD_INICIAL];
    }

    public VectorDeInts(VectorDeInts vector) {
        this.vector = vector.vector.clone();
    }

    public int longitud() {
        return vector.length;
    }

    public void agregarAtras(int i) {
        int[] newVector = new int[vector.length + 1];
        for (int j = 0; j < vector.length; j++) {
            newVector[j] = vector[j];
        }
        newVector[vector.length] = i;
        vector = newVector.clone();
    }

    public int obtener(int i) {
        return vector[i];
    }

    public void quitarAtras() {
        int[] newVector = new int[vector.length - 1];
        for (int j = 0; j < vector.length - 1; j++) {
            newVector[j] = vector[j];
        }
        vector = newVector.clone();
    }

    public void modificarPosicion(int indice, int valor) {
        vector[indice] = valor;
    }

    public VectorDeInts copiar() {
        VectorDeInts newVector = new VectorDeInts();
        newVector.vector = vector.clone();
        return newVector;
    }

}
