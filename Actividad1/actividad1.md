# Actividad 1 - Fundamentos y representación de listas enlazadas

## ¿Qué es una lista enlazada?

Una lista enlazada es una estructura de datos dinámica formada por nodos. Cada nodo contiene información y un enlace hacia otro nodo.

A diferencia de un arreglo, los elementos no necesitan encontrarse almacenados de manera consecutiva. Esto permite agregar o eliminar elementos modificando los enlaces entre los nodos.

En nuestro caso, cada nodo representa una solicitud de atención.

## Clasificación

### Lista simplemente enlazada

Cada nodo apunta al siguiente nodo.

S001 -> S002 -> S003 -> NULL

### Lista doblemente enlazada

Cada nodo puede apuntar al nodo anterior y al siguiente.

NULL <- S001 <-> S002 <-> S003 -> NULL

### Lista circular

El último nodo vuelve a conectarse con el primero.

S001 -> S002 -> S003 -> S004
 ^                     |
 |_____________________|

## Representación gráfica del caso

Se utilizarán cinco solicitudes de atención:

- S001: Juan - Soporte técnico
- S002: María - Reclamo
- S003: Carlos - Consulta
- S004: Ana - Soporte técnico
- S005: Pedro - Reclamo

Representación:

INICIO
  |
  v
[S001 | Juan | Soporte]
          |
          v
[S002 | María | Reclamo]
          |
          v
[S003 | Carlos | Consulta]
          |
          v
[S004 | Ana | Soporte]
          |
          v
[S005 | Pedro | Reclamo]
          |
          v
         NULL

Cada nodo contiene los datos de una solicitud y un enlace hacia la siguiente.

El último nodo apunta a NULL, indicando que se llegó al final de la lista.

## Conclusión

Las listas enlazadas son apropiadas para este caso porque las solicitudes cambian constantemente.

Permiten agregar o eliminar solicitudes modificando los enlaces entre los nodos sin tener que reorganizar toda la estructura.