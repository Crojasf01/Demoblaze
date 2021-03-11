Feature: Prueba a los servicios

  Background:
    * url 'https://petstore.swagger.io/'

Scenario: agregar un mascota
    Given path 'v2/pet'
    And request
    """
        {
      "id": 0,
      "category": {
        "id": 0,
        "name": "string"
      },
      "name": "duck",
      "photoUrls": [
        "string"
      ],
      "tags": [
        {
          "id": 0,
          "name": "string"
        }
      ],
      "status": "available"
    }
    """
    When method post
    Then status 200


  Scenario: Obtener un mascota ya existente
    Given path 'v2/pet/1'
    When method get
    Then status 200



  Scenario: Modificar un mascota ya existente duck
    Given path 'v2/pet'
    And request
    """
    {
      "id": 0,
      "category": {
        "id": 0,
        "name": "string"
      },
      "name": "duck",
      "photoUrls": [
        "string"
      ],
      "tags": [
        {
          "id": 0,
          "name": "string"
        }
      ],
      "status": "available"
    }
    """
    When method put
    Then status 200




