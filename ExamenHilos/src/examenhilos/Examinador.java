package examenhilos;

public class Examinador implements Runnable {
    private Thread hilo;
    BufferExamenes buffer;

    public Thread getHilo() {
        return hilo;
    }

    public Examinador(String alumno, BufferExamenes generador) {
        // Construye el hilo. El nombre será el nombre del alumno.
        hilo=new Thread(this,alumno);

        // Establece el valor de la propiedad buffer

        this.buffer=generador;
        hilo=new Thread(this,"Examinador");
        // Inicia el hilo.
        hilo.start();
    }

    @Override
    public void run() {
        String codigoExamen = this.buffer.consumirExamen();
        if (codigoExamen != null) {
            // Simula aquí un examen de 10 preguntas
            // cuyas respuestas se seleccionarán al azar
            // entre A, B, C, D o – (sin contestar).

        }
        else {
            System.out.println("Agotado tiempo de espera y " +
                    "no hay más exámenes");
        }
    }
}

