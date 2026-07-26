///<icon src="AllIcons.Nodes.Class"/>&nbsp;<b>Classe Serviço:</b> guardar atributos de Serviço, reutilizável para agendamentos.<br>
///<icon src="AllIcons.Toolwindows.ToolWindowDevMode"/>&nbsp;<b>@author:</b> Tiago.dev<br>
///<icon src="AllIcons.Status.Success"/>&nbsp;<b>@version:</b> 1.0

public class Servico {
    private final int id;
    private final String nome;
    private final int duracaoMinutos;
    private final double preco;

    public Servico(int id, String nome, int duracaoMinutos, double preco) {
        this.id = id;
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.preco = preco;
    }
}