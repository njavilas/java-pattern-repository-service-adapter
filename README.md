Vamos a hacer un ejemplo sencillo usando el patrón Repository - Service - Adapter, donde:

Repository: usa un HashMap como almacenamiento en memoria (sin base de datos).

Service: contiene la lógica de negocio.

Adapter: será una clase Java que actúe como punto de entrada (por ejemplo, tipo consola o test), sin usar HTTP ni frameworks como Spring.