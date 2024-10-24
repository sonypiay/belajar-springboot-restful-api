# Contact API Specification

## Create Contact
Endpoint : POST /api/contacts 

Request Header:
- X-API-Token: your-token-id (required)

Request Body :

```json
{
  "firstname": "John",
  "lastname": "Doe",
  "email": "john.doe@example.com",
  "phone": "0889012345"
}
```

Response Body (success):

```json
{
  "data": {
    "id": "random-string",
    "firstname": "John",
    "lastname": "Doe",
    "email": "john.doe@example.com",
    "phone": "0889012345"
  }
}
```

Response Body (failed, 400):

```json
{
  "errors": "Email format is invalid, phone format is invalid"
}
```

## Update Contact
Endpoint : PUT /api/contacts/{id}

- X-API-Token: your-token-id (required)

Request Body :
```json
{
  "firstname": "John",
  "lastname": "Doe",
  "email": "john.doe@example.com",
  "phone": "0889012345"
}
```

Response Body (success):
```json
{
  "data": {
    "id": "random-string",
    "firstname": "John UPDATED",
    "lastname": "Doe UPDATED",
    "email": "john.doe@example.updated.com",
    "phone": "123456"
  }
}
```

Response Body (failed, 400):
```json
{
  "errors": "Email format is invalid, phone format is invalid"
}
```

## Get Contact
Endpoint : GET /api/contacts/{id}

- X-API-Token: your-token-id (required)

Response Body (success):
```json
{
  "data": {
    "id": "random-string",
    "firstname": "John",
    "lastname": "Doe",
    "email": "john.doe@example.com",
    "phone": "123456"
  }
}
```

Response Body (failed):
```json
{
  "errors": "Contact not found"
}
```

## Search Contact
Endpoint : GET /api/contacts

- X-API-Token: your-token-id (required)

Request Parameter :
- name : String, contact firstname or lastname, using like query // optional
- phone : String, contact phone number using like query // optional
- email : String, contact email using like query // optional
- page : Integer, start from 0
- size : Integer, default from 10 per rows

Response Body (success):

```json
{
  "data": [
    {
      "id": "123",
      "firstname": "John",
      "lastname": "Doe",
      "email": "john.doe@example.com",
      "phone": "123456"
    },
    {
      "id": "456",
      "firstname": "Jane",
      "lastname": "Doe",
      "email": "jane.doe@example.com",
      "phone": "654321"
    }
  ],
  "paging": {
    "totalPage": 10,
    "size": 10,
    "currentPage": 0
  }
}
```
Response Body (failed):

```json
{
  "errors": "Unauthorized"
}
```

## Remove Contact
Endpoint : DELETE /api/contacts/{id}
- X-API-Token: your-token-id (required)

Response Body (success):
```json
{
  "data": "Success"
}
```
Response Body (failed):
```json
{
  "errors": "Contact not found"
}
```