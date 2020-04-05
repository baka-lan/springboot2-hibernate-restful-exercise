This module is a relatively simple REST service, which has two methods that operate on the entities of the “task”.

Tasks consist of id, order id, date, time and a sign of completion ("resolved").

The first method (POST) adds a new task to the database by order number. It is assumed that the client application contains the order number and we can use it here.

The second method (GET) returns a list of tasks by date range and, optionally, by order number.

Settings for connecting to the database are specified in the application.properties