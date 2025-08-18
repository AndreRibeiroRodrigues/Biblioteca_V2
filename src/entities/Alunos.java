package entities;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    List<Aluno> alunos = new ArrayList<>();


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
