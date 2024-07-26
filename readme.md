### Java 21 Api com ThymeLife

#### End Points
* Get
* Put
* Post
* Delete

#### End Points rotas
* Get Produto id
```
http://localhost:8080/produto/1
```

* Get Produto Todos
```
http://localhost:8080/produto
```

#### Entidades
* Endereço
* Cliente
* Categoria
* Produto

#### Links para download e CDNs
* Java jdk 21
```
https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.zip
```

* Bootstrap Style
```
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
```

* Bootstrap Icons

* Bootstrap Script


#### Ref.
* treina web
https://www.treinaweb.com.br/painel/cursos/spring-framewok-templates-com-thymeleaf/aula/8/subaula/1


### Outs ...
### Projeto API Full

#### Refe.
* Servicos
```
https://www.youtube.com/watch?v=Sun4wXH88V4
```

* Api de farmacia
```
https://www.youtube.com/watch?v=6YfzvYWnwvg
```

* Security
```
https://www.youtube.com/watch?v=O0pmUNUINbs
```

* Kiwify
```
https://pay.kiwify.com.br/mXnHYBK
```

#### Entitis
* Categoria
* Servico
* Usuario
* Taxa

#### tags

git tag v2.0
git push origin v1.0

#### Cofigurando dotEnv
* pom.xml
```
<dependency>
    <groupId>me.paulschwarz</groupId>
    <artifactId>spring-dotenv</artifactId>
    <version>2.3.0</version>
</dependency>
```

* criando arquivo .env
```
DB_BANCO_URL=jdbc:mysql://localhost:3306/api-java
DB_USERNAME=root
DB_PASSWORD=
```

* Configurando o aplication.properties
```
spring.datasource.url=${env.DB_BANCO_URL}
spring.datasource.username=${env.DB_USERNAME}
spring.datasource.password=${env.DB_PASSWORD}
```