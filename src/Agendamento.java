import java.time.LocalDateTime;
///<icon src="AllIcons.Nodes.Class"/>&nbsp;<b>Classe Agendamento:</b> ligar as classes Cliente, Barbeiro, Servico e horário.<br>
///<icon src="AllIcons.Toolwindows.ToolWindowDevMode"/>&nbsp;<b>@author:</b> Tiago.dev<br>
///<icon src="AllIcons.Status.Success"/>&nbsp;<b>@version:</b> 1.0

public class Agendamento {
    private long id;
    private Cliente cliente;
    private Barbeiro barbeiro;
    private Servico servico;
    private LocalDateTime horario;
    private StatusAgendamento status;

    public Agendamento(long id, Cliente cliente, Barbeiro barbeiro, Servico servico, LocalDateTime horario) {
        this.id = id;
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.servico = servico;
        this.horario = horario;
        this.status = StatusAgendamento.CONFIRMADO; // Ao criar um agendamento ele já é confirmado automaticamente
    }

    public enum StatusAgendamento {
        CONFIRMADO,
        CANCELADO,
        CONCLUIDO
    }
}