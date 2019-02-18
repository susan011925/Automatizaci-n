#language:es
#autor:Susana Campo

Característica: En esta suite de pruebas 
se realizarán los casos de prueba correspondientes
a los flujos diseñados para gestionar las fechas en google calendar

Antecedentes: 
Dado que Susana quiere loguearse en la aplicación de Google
Cuando inicia sesión en Google Calendar
Y  Susana quiere crear un nuevo evento Google Candelar

@Caso1
Escenario: Crear un nuevo evento en Google Calendar
Cuando diligencia los datos necesarios para crear un nuevo evento
|tituloEvento|fechaInicial|horaInicial|fechaFinal|horaFinal|recordatorio|
|Automatizando evento|2019-05-01|8:15am|2019-05-01|9:00am|Cada día|
Entonces el evento debe ser creado