# LOTOFÁCIL - Sistema de Loteria em Java

O sistema LOTOFÁCIL é um projeto de loteria desenvolvido em Java, permitindo aos jogadores fazer apostas em diferentes categorias e verificar os resultados para ganhar prêmios. Este sistema funciona através do terminal, realizando leituras e escritas de dados.

## Funcionalidades

- **Geração de jogos aleatórios:** O sistema é capaz de gerar números ou letras aleatórias para as apostas.
- **Apostas dos jogadores:** Os jogadores podem fazer suas apostas em diferentes categorias.
- **Verificação de resultados:** Após as apostas, o sistema compara as escolhas dos jogadores com os resultados gerados aleatoriamente.
- **Cálculo de prêmios:** Baseado nas regras de negócio, o sistema calcula os prêmios dos jogadores vencedores.

## Vídeo demonstrativo


https://github.com/lucasgabrielrs/Linguagens-de-programacao/assets/123906808/695e15aa-0c2b-4d04-b1d0-5ec09aacd70f


## Menu de Apostas

O sistema oferece um menu com as seguintes opções de apostas:

Menu LOTOFÁCIL:

1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair

### Regras para a aposta de 0 a 100

- Utiliza a biblioteca `Scanner` para leitura de um número inteiro de 0 a 100.
- Utiliza a biblioteca `Random` para sortear um número de 0 a 100.
- Compara o número escolhido pelo usuário com o número sorteado.
- Premiação de R$ 1.000,00 reais para acertos.

### Regras para a aposta de A à Z

- Lê um caractere de A a Z usando `System.in.read()`.
- Verifica se a entrada é uma letra e a converte para maiúscula.
- Compara a letra digitada com a letra premiada (inicial do nome do desenvolvedor).
- Premiação de R$ 500,00 reais para acertos.

### Regras para a aposta de número par ou ímpar

- Utiliza `Scanner` para leitura de um número inteiro.
- Verifica se o número é par usando o operador de módulo (%).
- Premiação de R$ 100,00 reais para números pares.

## Tecnologias Utilizadas

- Java
- Biblioteca `Scanner` para leitura de dados
- Biblioteca `Random` para geração de números aleatórios
- Uso de estruturas de controle como `switch case` e `do while`

### Como Clonar e Executar

Para executar o projeto em sua máquina, siga estes passos:

#### Pré-requisitos

- **Java JDK 17** ou superior instalado em sua máquina.
- **Git** instalado em sua máquina.

#### Clonando o Projeto

1. Abra um terminal.
2. Execute o comando para clonar o repositório:

git clone https://github.com/lucasgabrielrs/Linguagens-de-programacao.git

3. Após clonar o projeto, navegue até a pasta do projeto:

cd .\Linguagens-de-programacao\LotoFacil\LotoFacil\src

4. Compile o código-fonte Java

javac LotoFacil.java

5. Com o código compilado, execute o programa:

java Lotofacil.java

Você verá o menu de apostas sendo exibido no terminal. Siga as instruções na tela para fazer suas apostas.

Feito por Lucas Gabriel.

