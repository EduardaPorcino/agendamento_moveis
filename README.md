# 📦 Sistema de Agendamento e Montagem de Móveis

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-brightgreen)
![Plataforma](https://img.shields.io/badge/plataforma-console-blue)
![Licença](https://img.shields.io/badge/licença-livre%20para%20estudo-lightgrey)
![Feito com](https://img.shields.io/badge/feito%20com-%E2%98%95-brown)

Sistema simples em **Java**, executado via terminal (console), para gerenciar o fluxo de compra, agendamento, entrega e montagem de móveis. O projeto permite cadastrar clientes e móveis, registrar datas importantes do processo de venda e acompanhar o status da entrega.

## 📋 Funcionalidades

O sistema oferece um menu interativo com as seguintes opções:

| Opção | Funcionalidade |
|-------|----------------|
| 1 | Cadastro de cliente (nome, telefone, endereço) |
| 2 | Cadastro de móveis (nome e preço) |
| 3 | Registrar o dia da compra (data atual) |
| 4 | Registrar o agendamento (15 dias após a compra) |
| 5 | Atualizar o status da entrega (Agendada, Em rota, Entregue, Cancelada) |
| 6 | Registrar o dia da entrega (data atual) |
| 7 | Registrar a data da montagem já realizada |
| 8 | Exibir relatório geral com todos os dados registrados |
| 0 | Encerrar o sistema |

## 🛠️ Tecnologias utilizadas

- **Java** (JDK 8+)
- Classes utilizadas:
  - `java.util.Scanner` — leitura de dados do usuário
  - `java.time.LocalDate` — manipulação de datas
  - `java.time.format.DateTimeFormatter` — formatação de datas (`dd/MM/yyyy`)

## 📂 Estrutura do projeto

```
montagem_moveis/
└── Montagem_moveis.java
```

## ▶️ Como executar

### Pré-requisitos
- Ter o **JDK (Java Development Kit)** instalado (versão 8 ou superior).

### Passos

1. Clone o repositório ou baixe o arquivo `Montagem_moveis.java`.
2. Compile o arquivo:
   ```bash
   javac Montagem_moveis.java
   ```
3. Execute o programa:
   ```bash
   java montagem_moveis.Montagem_moveis
   ```
4. Use o menu exibido no terminal para navegar entre as opções.

## 💡 Exemplo de uso

```
1 - Cadastro de cliente 
2 - Cadastro de moveis
3 - Registrar o dia da compra
4 - Registrar o agendamento
5 - Atualizar o Status da Entrega
6 - Registrar o dia da entrega
7 - Registrar a data da montagem ja realizada
8 - Espelho dos Dados
0 - Encerrar 
Escolha uma opcao
```

Ao escolher a opção **4**, o sistema calcula automaticamente uma data de agendamento **15 dias após a data da compra** (registrada na opção 3).

## 📝 Observações

- O sistema funciona com **uma única instância de cliente e móvel por execução** (não há armazenamento em lista ou banco de dados — os dados são sobrescritos a cada novo cadastro).
- Os dados não são persistidos: ao encerrar o programa, todas as informações são perdidas.
- O agendamento depende do registro prévio da compra (opção 3 antes da opção 4).

## 🚀 Possíveis melhorias futuras

- Armazenar múltiplos clientes e móveis (uso de listas ou estruturas de dados).
- Persistência de dados em arquivo ou banco de dados.
- Validação de entradas (ex.: telefone, datas, valores negativos).
- Interface gráfica (GUI) ou versão web.

## 📄 Licença

Este projeto é de uso livre para fins de estudo e aprendizado.
