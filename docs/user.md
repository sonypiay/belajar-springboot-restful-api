# User API Specification

## Register User
Endpoint: POST /api/users

Request Body:
```json
{
  "username": "sonypiay",
  "password": "123",
  "name": "sony drmwn"
}
```

Response Body (success):

```json
{
  "data": "OK"
}
```

Response Body (failed):

```json
{
  "errors": "Username must not blank"
}
```


## Login User

Endpoint: POST /api/auth/login

Request Body:
```json
{
  "username": "sonypiay",
  "password": "123"
}
```

Response Body (success):

```json
{
  "data": {
    "token": "your-token-id",
    "expiredAt": 3600 // miliseconds
  }
}
```

Response Body (failed):

```json
{
  "errors": "Invalid username or password"
}
```

## Update User
Endpoint: PATCH /api/users

Request Header:
- X-API-Token: your-token-id (required)

Request Body:
```json
{
  "name": "sonypiay", // optional
  "password": "123" // optional
}
```
Response Body (success):
```json
{
  "data": {
    "username": "sonypiay-edit",
    "name": "sony drmwn edit"
  }
}
```

Response Body (failed, 400):

```json
{
  "errors": "Username must not be blank"
}
```

## Get User
Endpoint: GET /api/users

Request Header:
- X-API-Token: your-token-id (required)

Response Body (success):
```json
{
  "data": {
    "username": "sonypiay",
    "name": "sony drmwn"
  }
}
```
Response Body (failed 401):

```json
{
  "errors": "Unauthorized"
}
```

## Logout User

Endpoint: DELETE /api/users

Request Header:
- X-API-Token: your-token-id (required)

Response Body (success):
```json
{
  "data": "Logout success"
}
```