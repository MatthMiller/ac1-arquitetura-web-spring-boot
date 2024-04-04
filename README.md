# Exercícios 2, 3, 4

Enunciado:
<br>
• Sua equipe está encarregada do microserviço referente a alunos. Mais
especificamente ao CRUD dos mesmos.
<br>
• Pense em alguns (pelo menos 5) atributos que um aluno possui (não há
necessidade agora de existir relacionamentos do tipo “aluno está em curso”,
nesse caso curso pode ser uma string.
<br>
• Implemente um CRUD para o cadastro desse aluno
<br>
• Tire um print da resposta do postman (ou outra ferramenta que você escolher)
de uma requisição para cada endpoint implementado.
<br>
• Lembre-se de criar a estrutura para armazenar os alunos.
<br>
• Salve os prints e deixe-os guardados, assim como o código (o código de
preferência em um repositório), pois irão precisar para a AC1.

### POST `/alunos` - Criar aluno)

![](/repo-images/alunos_post.png)

### GET `/alunos` - Mostrar todos os alunos

![](/repo-images/alunos_get.png)

### GET `/alunos/{id}` - Mostrar um aluno específico

![](/repo-images/alunos_get_one.png)

### PUT `/alunos/{id}` - Atualizar um aluno específico

![](/repo-images/alunos_put.png)

### DELETE `/alunos/{id}` - Deletar um aluno específico

![](/repo-images/alunos_delete.png)

### Todos os alunos. Depois de algumas alterações através do CRUD:

![](/repo-images/alunos_get_novo.png)
