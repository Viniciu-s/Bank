# Overview
This project simulates a bank where it is possible to perform operations such as creating an account, checking balance, depositing, and withdrawing.

## Requirements
- [Java 17](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
- [MySQL](https://www.mysql.com/downloads/)
- [Postman](https://www.postman.com/downloads)

## Usage
- Start the application with Maven
- The API is accessible at http://localhost:8080

## Endpoints
`API BANK`

```
PUT /account - Create a new account
```

```json
{
  "bankName": "Santander",
  "ownerName": "Vinicius Vieira"
}
```
- Output data
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
POST /transaction/deposit - Deposit money
```

```json
{
  "targetAccountNo": "91612563",
  "amount": 4500.00
}
```
- Output data
```
Operation completed successfully
```

````
POST /account - Withdraw money
````
````json
{
  "sortCode": "01-62-90",
  "accountNumber": "91612563",
  "amount": 1800
}
````
- Output data
````
Operation completed successfully
````

```
POST /account - Check account balance
```
````json
{
    "sortCode": "01-62-90",
    "accountNumber": "91612563"
}
````
- Output data
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
