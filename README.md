listar produtos metodo GET

http://localhost:9000/api/produto


adicionar produto

metodo post, url: http://localhost:9000/api/produto

no body:

  {
        
        "produtoId": "123",
        "nome": "detergentessssss",
        "valor": "122.00"
    }


delete

metodo delete, url:http://localhost:9000/api/produto
passo no body qual quero deletar
   {
        "codigo": 3,
        "produtoId": "321",
        "nome": "sabonete",
        "valor": "2.00"
    }


atualizar: 

metodo PUT, url: http://localhost:9000/api/produto
body:
   {
        "codigo": 2,
        "produtoId": "321",
        "nome": "sabonete liquido",
        "valor": "2.00"
    }


litar produto

metodo get url: http://localhost:9000/api/produto/1   {passa o codigo do produto}




A API conta com spring actuator e Spring boot admin:

			Actuator

1. baixar a dependência do spring boot actuator
2. no application.properties adicionar as seguintes configurações:

management.endpoint.health.show-details=always
management.endpoints.web.exposure.include=*
info.app.name=@project.name@
info.app.version=@project.version@

#http://localhost:9000/actuator/ method GET saber informações sobre a api
vai exibir várias links para informações da API. Exemplo se ela estar funcionando fica up se não fica down. Informa o banco de dados e se ele estar funcionando. 

		spring boot admin
tem que estar na mesma versão o projeto do spring boot admin que for adicionado

no servidor:

dependencia web e do spring boot admin

e no main alterar as anotações para a do spring boot admin.

alterar a porta para acesso.


no cliente(aplicações que serão gerenciadas):

adicionar a dependência no pom do spring boot admin
e adicionar o caminho do servidor no application.properties
