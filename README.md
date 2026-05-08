# Padrões de Projeto - Builder

---

## Estrutura do Projeto

- **Entidade Complexa (Produto):** `OrdemServico` → Classe que representa o objeto final a ser criado. Ela possui diversos atributos (como número da OS, equipamento, quilometragem da malha e peças), o que tornaria um construtor tradicional inviável e confuso.
- **Construtor (O Builder):** `OrdemServicoBuilder` → Classe responsável por encapsular a lógica de montagem da `OrdemServico`. Ela possui métodos "setters" fluentes que retornam a própria instância do construtor (`return this;`), permitindo o encadeamento de chamadas.
- **Validação e Entrega:** Método `build()` → Presente no Builder, é o método final chamado para retornar o objeto construído. Ele atua como um "guarda", aplicando regras de negócio e validações (ex: impedir OS sem número ou sem descrição) antes de liberar a instância final para o sistema.
- **Testes:** `OrdemServicoBuilderTest` → Valida com JUnit as regras de negócio de criação, assegurando que o sistema lance exceções (`IllegalArgumentException`) ao tentar criar instâncias inválidas, além de garantir que um objeto completamente preenchido armazene corretamente todos os seus dados.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O grande destaque arquitetural é a relação de composição entre as classes e o retorno do próprio tipo `OrdemServicoBuilder` em seus métodos de configuração, caracterizando a interface fluente (*fluent interface*) do padrão.

<img width="548" height="664" alt="Diagrama Builder" src="https://github.com/user-attachments/assets/9d69a684-2c29-44c5-9428-02bcaf975a62" />
