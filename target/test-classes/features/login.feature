Feature: Inicio de sesión

  Scenario: Inicio de sesión exitoso con credenciales válidas
    Given El usuario navega a la página de login
    When Ingresa el nombre de usuario "tomsmith"
    And Ingresa la contraseña "SuperSecretPassword!"
    And Hace clic en el botón de login
    Then El sistema debe mostrar el mensaje "You logged into a secure area!"
