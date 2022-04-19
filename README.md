# Revisão - continuação - Invocando funções do tipo callable (onCall)

Na nossa última aula revisamos como criar functions em Typescript. 

## Passo 1 - Crie uma function chamada verifyTriangle em Typescript do tipo callable

Sua function deve receber três parâmetros que representam os lados do triangulo. 
Ela deve devolver uma resposta JSON da seguinte maneira: 

```json  
{ 
  "triangleType": "EQUILATERO" 
}
```

caso não forme triangulo a resposta deverá ser: 

```json
{
  "triangleType": "NONE"
}
```

Antes de devolver a resposta a function deverá gravar no firestore um documento com as seguintes informações (na coleção results): 

```json
{
  "triangleType": "NONE"
}
```

OU SE FORMAR TRIANGULO: 

```json
{
  "triangleType": "EQUILATERO",
  "a": 10,
  "b": 10,
  "c": 10
}
```

Então a cada chamada da função, se houver formação de triangulo ou não, guarde o resultado no firestore como solicitado. 

## Passo 2 - Importe este projeto no Android Studio

Após fazer a firebase function, importe este projeto no Android Studio diretamente do github. 

## Passo 3 - Adicione as dependencias do Firebase e ajuste os arquivos Gradle.

Ajustes os arquivos build.gradle para funcionar com o Firebase, como explicado diversas vezes pelo professor.
Adicione as dependências do Firebase: Firebase BOM e Firebase Functions no build.gradle do módulo. 

## Passo 4 - Adicione o arquivo google-services.json no local correto do projeto

O arquivo google-services.json deve ser adicionado dentro do diretorio app como explicado anteriormente.

## Passo 5 - Termine a implementação do projeto invocando a Function ao clicar no botão verificar

Ao clicar no botão verificar, invoque a function que vai analisar se os 3 lados formam um triangulo e mostre o resultado na tela como desejar. 
Podendo ser um card ou apenas um snackbar.
