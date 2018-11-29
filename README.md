# ConfigClientDemo
Spring boot project to demo spring cloud configuration

1. [Start up the config server](https://github.com/nalinda6963/ConfigServerDemo/blob/master/README.md)
(This project is set to demo composite cofig serve, so yo have to go through the vault setup)
  
2. Start up the client
```
$ mvn spring-boot:run
```

3. Open a terminal and hit the end point
```
 curl -X "GET" "http://127.0.0.1:8010/demo/properties"
```

You should see the following output.
```json
["bar_vault", "test_git_Default"]
```
