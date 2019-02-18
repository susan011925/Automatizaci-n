#language:es
#autor:Susana Campo

Característica: En esta suite de pruebas 
se realizarán los casos de prueba correspondientes
a los flujos diseñados para gestionar las fechas en google calendar

Antecedentes: 
Dado que Susana quiere loguearse en la aplicación de Google
Cuando inicia sesión en Google Calendar
Y  Susana quiere crear un evento Google Candelar

@Caso1
Escenario: Crear un evento en Google Calendar
Cuando Susana diligencia los datos necesarios para crear un nuevo evento
|tituloEvento|fechaInicial|horaInicial|fechaFinal|horaFinal|recordatorio|
|Automatizando evento|2019-05-01|8:15am|2019-05-01|9:00am|Cada día|
Entonces el evento debe ser creado

@Caso2
Escenario: Crea un calendario en Google Calendar
Cuando Susana diligencia los datos necesarios para crear un nuevo calendario
Entonces el calendario debe ser creado

@Caso3
Escenario: Modifica un evento en Google Calendar
Cuando Susana diligencia la datos de un evento existente 
Entonces el evento debe ser modificado

@Caso4
Escenario: Selecciona calendario Google Calendar
Cuando Susana selecciona calendario en la principal de Google Calendar 
Entonces el calendario de ser visualizado

@Caso5
Escenario: Imprime calendario de la vista previa
Cuando Susana diigencia los datos necesarios para imprimir el calendario 
Entonces el calendario debe ser impreso




