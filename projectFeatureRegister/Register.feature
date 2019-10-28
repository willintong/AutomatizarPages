Feature: Prueba de registro
  Yo como usuario de SDETraining
  Quiero que cuando ingrese a la pagina de login
  Me pueda loguear

  Scenario Outline: el usuario se puede registrar con credenciales validads
    Given el usuario esta en la pagina principal
    And   le da clic en el boton crear cuenta
    When  el usuario ingrese credenciales validas "<name>"
    And   el email "<email>"
    And   el phone "<phone>"
    And   selecciona el genero Male
    And   el password "<password>"
    And   verifique el password "<verify-password>"
    And   hace clic en el listado de paises
    And   selecciona un pais
    And   selecciona un tipo de subcripcion
    And   selecciona hace clic en el boton submit
    Then  el usuario puede ver el panel de administracion "<message>"

    Examples:
      |name  |email |phone  |password  |verify-password |message
      |andres|ns@jbd |123232|asd$123   |asd$123         |Customer information added successfully
