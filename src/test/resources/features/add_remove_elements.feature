Feature: Add and Remove Elements

  Scenario: Añadir un nuevo elemento dinámicamente
    Given El usuario está en la página de Add/Remove Elements
    When Hace clic en el botón "Add Element"
    Then Se debe mostrar un botón "Delete"

  Scenario: Eliminar un elemento dinámicamente
    Given El usuario está en la página de Add/Remove Elements
    And Hace clic en el botón "Add Element"
    When Hace clic en el botón "Delete"
    Then El botón "Delete" ya no debe estar visible
