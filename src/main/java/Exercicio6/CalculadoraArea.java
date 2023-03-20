package Exercicio6;

public class CalculadoraArea {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(10);
        FiguraGeometrica retangulo = new Retangulo(13, 14);
        FiguraGeometrica triangulo = new Triangulo(4, 5);
        FiguraGeometrica circulo = new Circulo(7.5);

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Area do triangulo: " + triangulo.calcularArea());
        System.out.println("Area do circulo:  " + circulo.calcularArea());
    }
}
