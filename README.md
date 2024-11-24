## Step-by-step para testar aplicação:  
1. Utilizar Postman ou Insomnia para gerar código para o redirecionamento.
2. Utilizar método POST na url "https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/create" e inserir conteúdo no body conforme JSON de exemplo abaixo:  
     {  
          "expirationTime": "1732100181",  
          "originalUrl": "https://aula-bootstrap-iota.vercel.app/" //inserir a url para onde ocorrerá o redirecionamento
     }
   1. IMPORTANTE: o valor do timestamp tem que ser em segundos. Utilizar o seguinte link para converter: https://www.epochconverter.com/
4. Após gerar o código, copiar e colar após a barra ("/") na seguinte URL diretamente no navegador:  
https://mz83bvzj6c.execute-api.us-east-2.amazonaws.com/<**colar código gerado aqui**>
5. Você será redirecionado para a página inserida no campo "orignalUrl".
