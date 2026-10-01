package Instrumentos_Musicais;

public class main {

    public static void main(String[] args) {

        Instrumento[] instrumentos = {
            new Violão(),
            new Piano(),
            new Bateria()
        };

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}

