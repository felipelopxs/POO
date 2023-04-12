package poligono;

public class Quadrado extends PoligonoRegular{
    public Quadrado(int numLado, float tamLado) {
        super(numLado, tamLado);
    }

    public float calculaArea() {
        return getTamLado()*getTamLado();
    }
}
