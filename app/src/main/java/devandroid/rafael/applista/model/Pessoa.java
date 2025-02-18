package devandroid.rafael.applista.model;

public class Pessoa {
    private long id;
    private String nome;
    private String sobrenome;
    private Tarefa tarefa;
    private String telefone;

    public Pessoa(){
        tarefa = new Tarefa();
    }

    public Pessoa(String nome, String sobrenome, Tarefa tarefa, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tarefa = tarefa;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome:'" + this.nome +" "+this.sobrenome + ", tarefa: " + this.tarefa.getTarefa() + ", telefone:'" + this.telefone;
    }
}
