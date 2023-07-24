package examenhilos;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BufferExamenes generador = new BufferExamenes();
        

        ProductorExamenes p1 = new ProductorExamenes(generador);
        p1.run();
        Examinador ex1 = new Examinador("Rosa", generador);
        ex1.run();
        ProductorExamenes p2 = new ProductorExamenes(generador);
        p2.run();
        Examinador ex2 = new Examinador("Miguel", generador);
        ex2.run();
        ProductorExamenes p3 = new ProductorExamenes(generador);
        p3.run();
        Examinador ex3 = new Examinador("Carlos", generador);
        ex3.run();
    }
}
