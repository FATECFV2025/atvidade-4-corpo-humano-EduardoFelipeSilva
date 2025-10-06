[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RPHb6JFs)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20931256&assignment_repo_type=AssignmentRepo)
# Atividade 4 - Classe e Objeto



## Sumário 
- [Como Utilizar Esse Projteto](#como-utilizar-esse-projeto-)
- [Desafio da Atividade](#desafio-da-atividade-)
- [No Microsoft Teams](#no-microsoft-teams--)
- [Regras](#regras-)
- [Feedback](#feedback-)

## Como Utilizar Esse Projeto 📁

- Nesse projeto há  pasta:
    - src:Onde se encontra os codigo fonte. 

- Na sua máquina tem que ter instalado o <a href="https://www.oracle.com/br/java/technologies/downloads/" target="_blank">Java Development Kit (JDK) </a> 
- Caso utilize o VisualStudio Code é necessário que instale a <a href="https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack" target="_blank">Extension Pack for Java</a>


## Escopo da Atividade 🛠️

- Implementar uma classe que seja capaz de simular atuação dos modificadores de acesso e respectivamente os métodos getters/setters: 
- Implemente a Classe Corpo Humano e o Construtor  
- Implemente os métodos Getters
- Implemente os métodos Setters
- Implemente uma classe main que inclua as seguintes informações: Massa, Volume e Densidade



### Após essa implementação responda:

- Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

- R: Erro, devido a massa ser privado entao so pode ser alterado pelos set ou no construtor.

- Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

- R: Apos fazer esta alteração e se ficar a alteração anterior c1.massa = "2", a massa do objeto c1 passa a ser 2 devido ao atributo massa estar
publico.


- Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume).Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

- R: Não mudou nada porque não ta colocando informações via set e sim pelo construtor e caso tente usar o metodo set ele não vai 
encontrar o metodo porque esta private.



## DESAFIO 🚀

- Implementar o Atributo e os Metodos de acesso para Altura;
- Criar um método para calcular o Indíce de Massa Corporal (IMC), sendo: IMC = (Peso/Altura)*2
- Exibir/Imprimir o IMC na classe main

