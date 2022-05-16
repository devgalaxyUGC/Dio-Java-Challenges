package UsingMethods.SecondProject.Execute;


import UsingMethods.SecondProject.Domain.QuadrilaterosDomain;

public class QuadrilaterosExe {
    public static void main(String[] args) {
        QuadrilaterosDomain quadrado = new QuadrilaterosDomain();
        QuadrilaterosDomain retangulo = new QuadrilaterosDomain();
        QuadrilaterosDomain trapezio = new QuadrilaterosDomain();
        QuadrilaterosDomain losango = new QuadrilaterosDomain();

        System.out.println("Área do quadrado: "+quadrado.printArea(6));
        System.out.println("Área do retângulo: "+retangulo.printArea(6d,9d));
        System.out.println("Área do trapézio: "+trapezio.printArea(12,10,3.5));
        System.out.println("Área do losango: "+losango.printArea(15f, 10f));
    }
}
