# ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?
Sí, es posible tener un programa en Java que contenga varias clases con métodos main. Sin embargo, sólo se puede tener un único punto de entrada en un programa Java, que es el método main de una clase.

Cuando ejecutamos un programa Java, especificamos el nombre de la clase que contiene el método main que queremos que se ejecute. Java buscará ese método main y lo ejecutará como punto de entrada del programa. Si hay varias clases que contienen métodos main, debemos especificar cuál de esos métodos queremos ejecutar.

Por ejemplo, si tenemos dos clases Clase1 y Clase2, cada una con su propio método main, podemos ejecutarlos de la siguiente manera:

java Clase1 // Ejecuta el método main de la clase Clase1

java Clase2 // Ejecuta el método main de la clase Clase2
Si queremos que se ejecute el método main de una clase específica, debemos especificar el nombre de la clase que contiene ese método en el comando de ejecución.

Si queremos que la ejecución de un programa en Java tenga múltiples puntos de entrada, lo que se puede hacer es definir una clase que sirva como punto de entrada principal y que llame a los métodos main de las demás clases según sea necesario.