///<icon src="AllIcons.Nodes.Class"/>&nbsp;<b>Classe Cliente:</b> guarda dados pessoais do cliente e histórico de agendamentos.<br>
///<icon src="AllIcons.Toolwindows.ToolWindowDevMode"/>&nbsp;<b>@author:</b> Tiago.dev<br>
///<icon src="AllIcons.Status.Success"/>&nbsp;<b>@version:</b> 1.0

public class Cliente {
    private final long id;
    private final String nome;
    private final String telefone;
    private final String email;

    public Cliente(long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}/