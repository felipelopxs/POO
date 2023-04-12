package poligono;

public class Triangulo extends PoligonoRegular {

    public Triangulo(int numLado, float tamLado) {
        super(numLado, tamLado);
    }
    public float calculaArea() {
        return (getTamLado()*getTamLado())/2;
    }
}
