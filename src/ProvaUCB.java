public class ProvaUCB extends ProvaUniversidade{
    public ProvaUCB(double notaAV1, double notaAV2) {
        super(notaAV1, notaAV2);
    }
    public boolean Aprovado(){
        return calcularMedia() >= 7;
    }

    @Override
    public void ExibirInformacoes(){
        super.ExibirInformacoes();
        System.out.println("Média: " + calcularMedia());
        if (Aprovado() == true){
            System.out.println("Prova UCB: APROVADO \n");
        } else {
            System.out.println("Prova UCB: REPROVADO \n");
        }
    }
}
