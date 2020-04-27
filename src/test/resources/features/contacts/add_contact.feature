
@us01 @md-contactos @fc-agregarcontacto @regression
Feature: Agregar Contacto

  As a user
  I want to add new contacts
  So I can store their contact information.

  All users, free and paid, can add contacts.
  If new contact already exists, then user should be asked
  to decide to rename or add it anyway with the same name
  of existent contact.

  # Run before each escenario but after any before hook
  Background:
    Given un usuario se encuentra loggeado

  @developing
  Scenario: Agregar contacto exitosamente
    Given un usuario se encuentra en contactos
    When  el usuario agrega un contacto
    Then  el contacto es creado correctamente


  @new
  Scenario: Agregar contacto existente
    Given un usuario se encuentra en contactos
    When  el usuario agrega un contacto que ya existe
    Then  se solicita confirmación al usuario


  @new
  Scenario: Confirmar agregar contacto existente
    Given un usuario se encuentra en contactos
    When  el usuario agrega un contacto que ya existe
    And   confirma agregarlo de todas formas
    Then  se crea el contacto con el mismo nombre que el existente


  @new
  Scenario: Renombrar agregar contacto existente
    Given un usuario se encuentra en contactos
    When  el usuario agrega un contacto que ya existe
    And   decide renombrar el contacto
    Then  el contacto no es creado













  #Bad example - Procedure driven rather than Behavior driven
  @obsolete
  Scenario Outline: Agregar contacto exitosamente
    Given Contacto <nombre> no existe
    And   Estoy en pantalla llamadas
    When  Presiono Contactos
    And   Presiono boton Agregar Contacto
    And   Ingreso <nombre> en campo Nombre
    And   Ingreso <phone> en campo Telefono
    And   Ingreso <email> en campo Correo
    And   Presiono boton Guardar
    And   Presiono barra de busqueda
    And   Ingreso nombre <nombre> en barra de busqueda
    Then  Aparecen resultados de busqueda
    And   Nombre <nombre> aparece en resultados de busqueda
    Examples:
      | nombre   | phone          | email                       |
      | "Eliseo" | "+56961499611" | "eliseo.castro.v@gmail.com" |
      | "Gonzalo" | "+56999997402" | "goyaneder@acl"            |










