
package poligono;

public abstract class PoligonoRegular {
    private int numLado;
    private float tamLado;

    public int getNumLados() {
        return numLado;
    }

    public void setNumLados(int numLados) {
        this.numLado = numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }

    public PoligonoRegular(int numLado, float tamLado) {
        this.numLado = numLado;
        this.tamLado = tamLado;

    }
    public float calculaPerimetro(){
        return numLado*tamLado;
    }
    public abstract float calculaArea();
}


