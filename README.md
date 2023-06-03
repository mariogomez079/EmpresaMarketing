# EmpresaMarketing

Una empresa de marketing en línea ha crecido rápidamente y se está expandiendo a nuevos mercados. La empresa tiene varios proyectos en marcha y emplea a muchos trabajadores en diferentes roles. Cada proyecto tiene un nombre, una descripción, una fecha de inicio y una fecha de finalización prevista. Los proyectos pueden ser nacionales o internacionales. Para los proyectos nacionales, se registra el costo en pesos mexicanos y para los proyectos internacionales, se registra el costo en dólares estadounidenses y el país del cliente.

De los trabajadores, se conoce el nombre, la dirección de correo electrónico y el cargo que desempeñan en la empresa. Los trabajadores pueden ser empleados a tiempo completo o a tiempo parcial. En el caso de los empleados a tiempo parcial, se registra la cantidad de horas trabajadas por semana. Además, algunos trabajadores son becarios y se registra si son graduados o no.

Todos los proyectos tienen un valor de esfuerzo estimado que se determina de la siguiente manera:

Nacional (cantidad de semanas de duración * costo en pesos mexicanos) / 0.5

Internacional (cantidad de semanas de duración * costo en dólares) 

Los trabajadores reciben un salario, que se determina de la siguiente manera:

Para empleados a tiempo completo: 5000 + (1.5 * índice según el cargo). El índice toma un valor de 400 para los cargos de gerente y 250 para los demás cargos.
Para empleados a tiempo parcial: 2500 * cantidad de horas trabajadas por semana * índice según el cargo. El índice toma un valor de 200 para los cargos de asistente y 150 para los demás cargos.
Para becarios: Salario base - (3000 si es graduado, o 1500 si no lo es)

Muy bueno - Si la puntuación de la encuesta es de 8 o más.
Bueno - Si la puntuación de la encuesta está entre 6 y 7.9.
Regular - Si la puntuación de la encuesta está entre 4 y 5.9.
Malo - Si la puntuación de la encuesta es menor que 4.

La evaluación de un proyecto se realiza mediante una revisión de la calidad del trabajo y se califica de la siguiente manera:

Muy bueno - Si el costo real del proyecto es un 20% menor que el costo estimado.
Bueno - Si el costo real del proyecto está dentro del 20% del costo estimado.
Regular - Si el costo real del proyecto está dentro del 50% del costo estimado.
Malo - Si el costo real del proyecto es más del 50% del costo estimado.

a) Diseñe el diagrama de clases en UML para la situación anterior.
b) Desarrolle una aplicación con interfaz gráfica que permita

    Adicionar proyectos y trabajadores a la empresa
    Eliminar un trabajador del cual se conoce su nombre
    Conocer la cantidad de proyectos de cada tipo que tiene la empresa
    Evaluar a los trabajadores y proyectos
    Determinar el salario de un trabajador
    Conocer la cantidad de trabajadores becarios que son graduados
    Conocer el nombre del proyecto internacional con mayor costo real.

