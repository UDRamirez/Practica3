# README - Práctica 04 - Cadena de Películas "RockBuster"

## Equipo: *"Los Canekitas"*

| Nombre                          | Número de Cuenta |
|---------------------------------|------------------|
| Ramírez Macías Ulises Dante     | 319217535        |
| Ramírez Palacios Miguel         | 322216376        |
| Reyes Grimaldo Angel Ismael     | 119003833        |

---      

## Patrones de Diseño

### Patrón **Composite**
Partimos de la definición dada en clase: "El patrón de diseño "Composite" te permite componer objetos en estructura de árbol para representar jerarquías Composite deja al cliente tratar objetos individuales y composiciones de objetos uniformemente." La definición anterior nos indica la necesidad de tener una jerarquía la cuál será nuestras películas y sagas. La forma en la que el cliente "trata" a ambos objetos, tanto individuales como compuestos, serían nuestros métodos que dan información como el director, género, sinopsis, precio, étc. en el caso de que no sea un objeto compuesto daría un listado de la información individual.

### Patrón **Adapter**
Haciendo una análogía entre discos a sagas tal como canciones a películas, utilizamos el patrón Adapter para reutilizar toda nuestra estructura de "RockBuster" para "Mixdown". Realizamos una mínima modificación para poder agregar el año de estreno en nuestras canciones y discos.

---

## Instrucciones de Compilación y Ejecución

  Compilamos con:
  ```
  javac App.java
  ```
  Ejecutamos con:
  ```
  java App.java
  ```

*NOTA: Comando utilizado en Linux y con la versión Java 23 (JDK 23)*

---

## Descripción del Programa
Nuestro programa despliega un menú el cuál permite acceder a toda la información de cada uno de nuestros productos o colecciones de ellos, con la posibilidad de filtrarlos por género o costo máximo.

-
