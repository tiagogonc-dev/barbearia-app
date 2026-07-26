/// <icon src="AllIcons.Nodes.Class">&nbsp;<b>Classe Barbeiro:</b> guardar dados pessoais, ter uma agenda de horários.<br>
/// <icon src="AllIcons.Toolwindows.ToolWindowDevMode">&nbsp;<b>@author:</b> Tiago.dev<br>
/// <icon src="AllIcons.Status.Success">&nbsp;<b>@version:</b> 1.0</icon></icon></icon>

public class Barbeiro {
    private final int id;
    private final String nome;
    private final String especialidade;

    public Barbeiro(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }
}