# Address API Specification

## Create Address
Endpoint : POST /api/contacts/{contactId}/addresses

Request Header:
- X-API-Token: your-token-id (required)

Request Body :
```json
{
  "street": "Jalanin aja dulu",
  "city": "Jakarta",
  "province": "DKI Jakarta",
  "postal_code": 10640
}
```
Response Body (success):
```json
{
  "data": {
    "id": "random-string",
    "street": "Jalanin aja dulu",
    "city": "Jakarta Pusat",
    "province": "DKI Jakarta",
    "postal_code": 10640
  }
}
```
Response Body (failed, 400):
```json
{
  "errors": "Contact is not found"
}
```
## Update Address
Endpoint : PUT /api/contacts/{contactId}/addresses/{addressId}
- X-API-Token: your-token-id (required)

Request Body :
```json
{
  "street": "Jalanin aja dulu UPDATED",
  "city": "Jakarta UPDATED",
  "province": "DKI Jakarta UPDATED",
  "postal_code": 10650
}
```
Response Body (success):
```json
{
  "data": {
    "id": "random-string",
    "street": "Jalanin aja dulu UPDATED",
    "city": "Jakarta Pusat UPDATED",
    "province": "DKI Jakarta UPDATED",
    "postal_code": 10650
  }
}
```
Response Body (failed, 400):
```json
{
  "errors": "Contact is not found"
}
```

## Get Address
Endpoint : GET /api/contacts/{contactId}/addresses/{addressId}
- X-API-Token: your-token-id (required)

Response Body (success):
```json
{
  "data": {
    "id": "random-string",
    "street": "Jalanin aja dulu",
    "city": "Jakarta Pusat",
    "province": "DKI Jakarta",
    "postal_code": 10640
  }
}
```
Response Body (failed):
```json
{
  "errors": "Address not found"
}
```

## List Address
Endpoint : GET /api/contacts/{contactId}/addresses
- X-API-Token: your-token-id (required)

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
  "errors": "Contact not found"
}
```

## Remove Address
Endpoint : DELETE /api/contacts/{contactId}/addresses/{addressId}
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
  "errors": "Address not found"
}
```