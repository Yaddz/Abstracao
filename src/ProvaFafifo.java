public class ProvaFafifo extends ProvaUniversidade{
    public ProvaFafifo(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2);
    }

    public boolean Aprovado(){
        return calcularMedia() >= 6;
    }

    @Override
    public void ExibirInformacoes(){
        super.ExibirInformacoes();
        System.out.println("Média: " + calcularMedia());
        if (Aprovado() == true){
            System.out.println("Prova Fafifo: APROVADO \n");
        } else {
            System.out.println("Prova Fafifo: REPROVADO \n");
        }
    }
}
