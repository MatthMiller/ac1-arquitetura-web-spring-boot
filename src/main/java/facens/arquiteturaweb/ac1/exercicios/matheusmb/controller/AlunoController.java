package facens.arquiteturaweb.ac1.exercicios.matheusmb.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import facens.arquiteturaweb.ac1.exercicios.matheusmb.model.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final List<Aluno> alunos = new ArrayList<>();
    private Long proximoId = 1L;

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        aluno.setId(proximoId++);
        aluno.setDataMatricula(LocalDate.now()); // Define a data de matrícula como a data atual
        alunos.add(aluno);
        return aluno;
    }

    @GetMapping
    public List<Aluno> verTodos() {
        return alunos;
    }

    @GetMapping("/{id}")
    public Aluno verAlunoPorId(@PathVariable Long id) {
        return alunos.stream()
                .filter(aluno -> aluno.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId().equals(id)) {
                alunoAtualizado.setId(aluno.getId());
                alunoAtualizado.setDataMatricula(aluno.getDataMatricula()); // Mantém a data de matrícula original
                alunos.set(i, alunoAtualizado);
                return alunoAtualizado;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunos.removeIf(aluno -> aluno.getId().equals(id));
    }
}
