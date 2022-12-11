public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public Fila(No<T> refNoEntradaFila) {

    }

    // enfileirar//
    public void enqueue(T objeto) {
        No<T> novoNo = new No<T>(objeto);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        } else {
            return null;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxuliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxuliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxuliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (refNoEntradaFila == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";

                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }

}
