Step-by-step para testar aplicação:  
1- utilizar Postman ou Insomnia para gerar código para o redirecionamento.  
2- utilizar método POST na url "https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/create" com o seguinte JSON no body:  
{  
	"expirationTime": "**inserir aqui uma data tipo timestamp em segundos**", //exemplo: 1732100181  
 "originalUrl": "**inserir aqui a url desejada para o redirecionamento**" //exemplo: https://www.google.com/  
 }  
3- após gerar o código, copiar e colar após a barra ("/") na seguinte URL diretamente no navegador:  
https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/"**colar código gerado aqui**"
