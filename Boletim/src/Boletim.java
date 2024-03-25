public class Boletim {
     double n1;
     double n2;
     double media;

    // Construtor
    public Boletim(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método para calcular a média
    public void calculaMedia() {
        this.media = (n1 + n2) / 2;
    }

    // Método para verificar o conceito
    public String verificaConceito() {
        if (media >= 8.0 && media <= 10.0) {
            return "A";
        } else if (media >= 6.0 && media < 8.0) {
            return "B";
        } else if (media >= 4.0 && media < 6.0) {
            return "C";
        } else {
            return "D";
        }
    }

    // Método para imprimir o boletim
    public void imprimeBoletim() {
        System.out.println("Nota 1: " + this.n1);
        System.out.println("Nota 2: " + this.n2);
        System.out.println("Média: " + this.media);
        System.out.println("Conceito: " + verificaConceito());
    }


}
