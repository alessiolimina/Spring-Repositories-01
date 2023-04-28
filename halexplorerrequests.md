## Add car one
`POST` request body on `http:localhost:8080/cars/`:
```
{
  "modelName": "Alfa Romeo 147",
  "serialNumber": "154-66-44",
  "currentPrice": 15998
}
```
Response: `201 - Created`
## Add car two
`POST` request body on `http:localhost:8080/cars/`:
```
{
  "modelName": "Mercedes Classe B",
  "serialNumber": "154-99-33",
  "currentPrice": 52669
}
```
Response: `201 - Created`
## List of all the cars
`GET` request on `http:localhost:8080/cars/`

Response:
```
{
  "_embedded": {
    "cars": [
      {
        "modelName": "Alfa Romeo 147",
        "serialNumber": "154-66-44",
        "currentPrice": 15998,
        "_links": {
          "self": {
            "href": "http://localhost:8080/cars/1"
          },
          "car": {
            "href": "http://localhost:8080/cars/1"
          }
        }
      },
      {
        "modelName": "Mercedes Classe B",
        "serialNumber": "154-99-33",
        "currentPrice": 52669,
        "_links": {
          "self": {
            "href": "http://localhost:8080/cars/2"
          },
          "car": {
            "href": "http://localhost:8080/cars/2"
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/cars?page=0&size=2&sort=0"
    },
    "profile": {
      "href": "http://localhost:8080/profile/cars"
    }
  },
  "page": {
    "size": 2,
    "totalElements": 2,
    "totalPages": 1,
    "number": 0
  }
}
```
