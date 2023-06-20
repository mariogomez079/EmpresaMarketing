Proyecto Final de Introducción a la Programación 2

Autores:
Carlos Javier Plasencia Pérez
Mario Sergio Gómez Diaz


Empresa Marketing

Una empresa de marketing en línea con sede en México ha crecido rápidamente y se está expandiendo a nuevos mercados. La empresa tiene varios proyectos en marcha y para ello tiene a muchos trabajadores en diferentes roles. Cada proyecto tiene un nombre, una descripción y una cantidad de semanas de duración aproximada. Los proyectos pueden ser nacionales del territorio mexicano o internacionales. Para los proyectos nacionales, se registra el costo en pesos mexicanos, y para los proyectos internacionales, se registra el costo en dólares estadounidenses y el nombre del país del cliente.

La empresa cotiza todos los proyectos mediante la siguiente fórmula:
- Proyectos Nacionales: El coste del proyecto nacional se calcula como [cantidad de semanas de duración * costo en pesos mexicanos] y por tanto es (coste + el 10% de coste) * 7.25
- Proyectos Internacional: El coste del proyecto internacional se calcula como [cantidad de semanas de duración * costo en dólares] y por tanto es (coste + el 15% del coste) * 7.25

De los trabajadores de la empresa, se conoce el nombre, la dirección de correo electrónico y el cargo que desempeñan en la empresa. Los trabajadores pueden ser empleados a tiempo completo o a tiempo parcial. En el caso de los trabajadores a tiempo completo, se conoce que tienen un solapin. En el caso de los empleados a tiempo parcial, se registra la cantidad de horas trabajadas por semana y si es graduado o no. La empresa tiene un salario base de 1500 pesos para los no graduados y 3000 pesos para el resto de trabajadores en ambas modalidades (tiemplo completo o tiempo parcial).

La empresa se rige de la siguiente forma a la hora de realizar el pago a todos los trabajadores.
- Para los empleados a tiempo completo: (salario base + 5000$) + (1.5 * índice según el cargo). El índice toma un valor de 400 para los cargos de gerente y 250 para los demás cargos.
- Para los empleados a tiempo parcial: salario base + (1.5 * cantidad de horas trabajadas por semana) + índice según el cargo. El índice toma un valor de 200 para los cargos de asistente y 150 para los demás cargos.






Los proyectos nacionales y los trabajadores a tiempo parcial no graduados se llevan a una evaluación en rendimiento para conocer la mejoría incremental buscada y anhelada por la empresa utilizando lo siguiente:
    • Los proyectos nacionales:
Bien- Si coste del proyecto * cantidad de semanas de duración aproximada del proyecto es menor a 50.000 pesos mexicanos.
Regular- Si coste del proyecto * cantidad de semanas de duración aproximada del proyecto es mayor a 50.000 y menor a 100.000 pesos mexicanos.
Mal- Si coste del proyecto * cantidad de semanas de duración aproximada del proyecto es mayor a 100.000 pesos mexicanos.
    • Los trabajadores a tiempo parcial no graduados se califican como:
Muy Bien- Si la cantidad de horas trabajadas por semana está entre 10 y 14 horas semanales.
Bien- Si la cantidad de horas trabajadas por semana está entre 6 y 9 horas semanales.
Regular- Si la cantidad de horas trabajadas por semana está entre 2 y 5 horas semanales.
Mal- En caso contrario.


a) Diseñe el diagrama UML de clases para la situación anterior.
b) Desarrolle una aplicación con interfaz gráfica que permita

    1. Adicionar proyectos y trabajadores a la empresa.
    2. Eliminar proyectos y trabajadores donde se conoce el nombre.
    3. Conocer la cantidad de proyectos y trabajadores que tiene la empresa.
    4. Evaluar a los proyectos nacionales según la evaluación en rendimiento.
    5. Evaluar a los trabajadores a tiempo parcial no graduados según la evaluación en rendimiento.
    6. Determinar el salario de un trabajador a tiempo completo y a tiempo parcial siendo este último graduado o no.
    7. Determinar cuanto cotiza la empresa por los proyectos nacionales e internacionales que realiza.
    8.
    9. Conocer la cantidad de trabajadores a tiempo parcial que no son graduados.
    10. Conocer el nombre del país del proyecto internacional que más cotiza en la empresa.

