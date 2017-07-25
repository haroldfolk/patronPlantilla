PATRÓN DE DISEÑO TEMPLATE

Como bien sabemos, el código duplicado es el gran enemigo del “código limpio”. Existe un amplio abanico de recursos para intentar eliminarlo. Algunos patrones de diseño tienen como objetivo eliminar código duplicado. En esta exposicion intentaremos explicar cómo eliminar código duplicado con ayuda del patrón de diseño Template Method y los casos en los que puede ser interesante usarlo.

 

Uso
El método de plantilla está diseñado para marcos, donde cada cual implementa las partes invariables de la arquitectura de un ámbito, dejando para personalizar las opciones. Algunas razones por la que se utiliza el método de plantilla son:
Dejar que las subclases que se implementan (a través del método primordial) tengan un comportamiento que puede variar.
Evitar duplicación en el código: la estructura general de flujo de trabajo, está implementada una vez en el algoritmo de clase abstracta, y variaciones necesarias son implementadas en cada de las subclases.
