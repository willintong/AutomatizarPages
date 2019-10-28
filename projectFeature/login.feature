Feature: Prueba de login
  Yo como usuario de SDETraining
  Quiero que cuando ingrese a la pagina de login
  Me pueda loguear

  Scenario Outline: el usuario se puede logear con credenciales validads
    Given el usuario esta en la pagina de login
    When  el usuario ingrese credenciales validas "<email>"
    And   y el password "<password>"
    Then  el usuario puede ver el panel de administracion "<message>"

    Examples:
    |email                 |password           |message                      |
    |walopez@unac.edu.co   |czH7V3UTMiqAgRq    |Logged in successfully       |