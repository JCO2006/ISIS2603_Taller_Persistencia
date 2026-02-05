# Taller Persistencia

### Analisis de diseño

1.  ¿En cuál de las entidades (Proyecto o Tarea) quedó la columna de la llave foránea (project_id) en la base de datos? Explica por qué esto es necesario.
    R: En la tarea, esto porque la tarea tiene el many en la relacion de proyecto tarea. Sin la llave foranea, no hay manera de relacionar un proyecto con sus tareas

2.  Describe qué configuración específica utilizaste para que al borrar un Proyecto desaparezcan sus Tareas. ¿Cuál es la diferencia conceptual entre borrar la tarea de la lista del proyecto vs borrar el proyecto entero?
    R: Para asegurarse que al borrar un proyecto desaparezcan sus tareas se usa la etiqueta "@orphanRemoval". La diferencia entre borrar una tarea del proyecto vs borrar el proyecto entero es que al borrar una tarea, solo esa desaparece sin afectar las demas del proyecto; a diferencia de borrar el proyecto entero que ademas de eliminar el proyecto de la base de datos elimina todas las tareas de ese proyecto.

3.  Explica cómo funciona "por debajo" el método de búsqueda por estado. Si tuvieras que escribir el SQL de esa consulta manualmente, ¿cómo sería aproximadamente (SELECT ...)?
    R: La consulta realizada manualmente seria algo como "SELECT * FROM <TABLA> WHERE <condiciones>" que se traduce a "trae todas las columnas de la tabla <tabla> donde <condicion>"



## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
