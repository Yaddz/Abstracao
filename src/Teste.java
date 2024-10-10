public class Teste {
    public static void main(String[] args) {
        //Teste Aprovado
        System.out.println("Teste Aprovado");
        ProvaUCB alunoUCB = new ProvaUCB(7, 8);
        alunoUCB.ExibirInformacoes();
        ProvaFafifo alunoFafifo = new ProvaFafifo(5, 7);
        alunoFafifo.ExibirInformacoes();

        //Teste Reprovado
        System.out.println("Teste Reprovado");
        ProvaUCB alunoUCB2 = new ProvaUCB(3, 6);
        alunoUCB2.ExibirInformacoes();
        ProvaFafifo alunoFafifo2 = new ProvaFafifo(4, 4);
        alunoFafifo2.ExibirInformacoes();
    }
}
