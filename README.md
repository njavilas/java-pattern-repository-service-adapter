Implementación sencilla del patrón **Repository-Service-Adapter (RSA)** en Java. Este patrón organiza el código en capas separadas para mejorar la mantenibilidad, testeo y escalabilidad de una aplicación.

### 🧱 Estructura del Proyecto

El proyecto está dividido en tres capas principales:

1. **Repository**: Utiliza un `HashMap` como almacenamiento en memoria para simular una base de datos. Esta capa se encarga del acceso y manipulación de los datos.

2. **Service**: Contiene la lógica de negocio. Aquí se implementan las reglas y procesos que gobiernan el comportamiento de la aplicación.

3. **Adapter**: Actúa como punto de entrada de la aplicación. En este caso, es una clase Java que interactúa con el usuario a través de la consola, sin utilizar HTTP ni frameworks como Spring.

### 📂 Estructura de Carpetas

El código fuente se encuentra en el directorio `src`, organizado de la siguiente manera:

* `repository/`: Contiene las interfaces y clases relacionadas con el acceso a datos.
* `service/`: Incluye las clases que implementan la lógica de negocio.
* `adapter/`: Alberga la clase principal que sirve como interfaz de usuario en la consola.

### 🚀 Cómo Ejecutar el Proyecto

Para compilar y ejecutar el proyecto desde la consola:

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/njavilas/java-pattern-repository-service-adapter.git
   cd java-pattern-repository-service-adapter
   ```



2. **Compila el proyecto**:

   ```bash
   javac -d out src/adapter/Main.java
   ```



3. **Ejecuta la aplicación**:

   ```bash
   java -cp out adapter.Main
   ```



### ✅ Beneficios del Patrón RSA

* **Separación de responsabilidades**: Cada capa tiene una función específica, lo que facilita el mantenimiento y la comprensión del código.
* **Facilita las pruebas unitarias**: Al estar desacopladas, las capas pueden ser probadas de forma independiente.
* **Escalabilidad**: Es sencillo añadir nuevas funcionalidades o cambiar la implementación de una capa sin afectar a las demás.