# Visão Geral
Este projeto simula um banco aonde é possível realizar operações de criar conta,checar saldo, saque e depósito.

## Requisitos
- [Java 17](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
- [My SQL](https://www.mysql.com/downloads/)
- [Postman](https://www.postman.com/downloads)
- [Docker](https://www.docker.com/products/docker-desktop/)

## Uso
- Comece a aplicação com Maven
- A API está acessível na porta http://localhost:8080

## Docker
1. Faça o download das imagens:
docker pull vieiraenabled/bank
docker pull mysql
2. Execute o comando docker compose up.
3. Acesse a porta 8080 no postman.

## Endpoints
`API BANK`

```
PUT /account - Crie uma nova conta
```

```json
{
  "bankName": "Santander",
  "ownerName": "Vinicius Vieira"
}
```
- Dados de saída
````json
{
    "id": 1,
    "sortCode": "01-62-90",
    "accountNumber": "91612563",
    "currentBalance": 0.0,
    "bankName": "Santander",
    "ownerName": "Vinicius Vieira",
    "transactions": null
}
````

```
POST /transaction/deposit - Depositar dinheiro
```

```json
{
  "targetAccountNo": "91612563",
  "amount": 4500.00
}
```
- Dados de saída
```
Operation completed successfully
```

````
POST /transaction/withdraw - Sacar dinheiro
````
````json
{
  "sortCode": "01-62-90",
  "accountNumber": "91612563",
  "amount": 1800
}
````
- Dados de saída
````
Operation completed successfully
````

```
POST /account - Checar o saldo da conta
```
````json
{
    "sortCode": "01-62-90",
    "accountNumber": "91612563"
}
````
- Dados de saída
````json
{
    "id": 1,
    "sortCode": "01-62-90",
    "accountNumber": "91612563",
    "currentBalance": 2700.0,
    "bankName": "Santander",
    "ownerName": "Vinicius Vieira",
    "transactions": []
}
````
