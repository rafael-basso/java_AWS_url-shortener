## Step-by-step para testar aplicação:  
1. Utilizar Postman ou Insomnia para gerar código para o redirecionamento.
2. Utilizar método POST na url "https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/create" e inserir no body conforme JSON abaixo:  
     {  
          "expirationTime": "1732100181",  
          "originalUrl": "https://aula-bootstrap-iota.vercel.app/"  
     }
3. Após gerar o código, copiar e colar após a barra ("/") na seguinte URL diretamente no navegador:  
https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/<**colar código gerado aqui**>
