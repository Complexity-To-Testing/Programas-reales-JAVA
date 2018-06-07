# Programas-reales-JAVA
## Descripción
Programas java desarollados manualmente que se han utilizado en el [servicio web](https://github.com/Complexity-To-Testing/GUI)  para analizar los resultados depués de aplicar 
diferentes tipos de mutaciontes (generados con Pitest) sobre estos.

### Programa Personaje
Programa que te permite crear un personaje en abstracto y añadirle atributos, como por ejemplo su nombre, 
edad, qué coche tiene, donde vive y cómo es su casa, etc. Lo que ocurre es que, antes de crear un personaje 
y añadirle sus atributos, también hay que crear dichos atributos. 
Por ejemplo: el coche tiene ruedas, asientos, carrocería, etc.

### Programa Math
Tiene una estructura más “sencilla” que el anterior, y tan sólo consta de tres clases:
+ Vista: se encarga de interactuar con el usuario y enviar la información que le proporcione a la clase ControlMath.
+ ControlMath: intermediario entre la clase Vista y Ecuaciones. Se encarga de pasar la información que recibe entre ambas.
+ Ecuaciones: tiene los datos referentes a las ecuaciones matemáticas que utiliza el programa.
