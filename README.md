![Template Alura](https://github.com/carlucios/5st-Challenge-Oracle-ONE/blob/main/UnitsConverter.PNG?raw=true)

# 5st-Challenge-Oracle-ONE

# Resumo do projeto
O desafio foi desenvolver um aplicativo desktop em Java para fazer a conversão entre diversas cotações atualizadas, através de uma requisição a um API, além de mais um tipo de conversão, no caso, conversão entre diferentes unidades de temperatura.

##Estrutura escolhida
A ideia foi aplicar os conceitos aprendidos durante essa 3 etapa do curso, tais como encapsulamento, polimorfismo, herança e orientação a objetos. Então, a estrutura foi pensada para a classe executável servir como um controlador do fluxo do sistema, instaciando os objetos do tipo View e do tipo Model quando necessário.
Os objetos do tipo View foram pensados para interagir com o usuário e os objetod do tipo Model, a fim de encapsular funcionalidades.
A fim de construir uma palicação que fosse escalável, o funcionamento do sistema foi baseado na Classe Abstrata Unit e seus métodos abstratos, da qual todas as implementação existestes, Temparature e Currency, e as possíveis futuras implementações, pudessem definir as suas especificidades causando o mínimo de reescrita de código possível.
Por fim, foi implementado um API request para popular o atributo estático da Classe Currency.

## Técnicas e tecnologias utilizadas

- ``Java 9``
- ``Biblioteca javax.swing``
- ``Paradigma de orientação a objetos``
