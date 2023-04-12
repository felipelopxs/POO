package poligono;

public class Main {
    public static void main(String[] args) {
        Triangulo T1 = new Triangulo(3,4);
        Quadrado Q1 = new Quadrado(4,5);

        float areaTriangulo = T1.calculaArea();
        float areaQuadrado = Q1.calculaArea();

        System.out.println("A área do triângulo é :" + areaTriangulo);
        System.out.println("A área do triângulo é :" + areaQuadrado);

    }

}
