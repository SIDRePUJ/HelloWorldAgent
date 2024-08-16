# HelloWorldAgent

## Descripción

Este proyecto es un ejemplo básico de un agente creado utilizando el framework BESA. El agente, llamado `HelloWorldAgent`, se utiliza para propósitos de prueba y demostración. Muestra cómo se puede crear, inicializar y activar un agente en el sistema BESA, así como enviar eventos a dicho agente.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **HelloWorldMain**: Contiene la clase principal (`HelloWorldMain`) que sirve como punto de entrada para la aplicación.
- **HelloWorldAgent**: Contiene las clases que definen el agente, su estado y su guardia.

## Clases Principales

### 1. `HelloWorldMain`

Esta clase es el punto de entrada de la aplicación. En su método `main`, se realiza lo siguiente:
- Se inicializa el sistema de administración de BESA (`AdmBESA`).
- Se crea y se inicia un agente `HelloWorldAgent`.
- Se envía un evento al agente utilizando su guardia `HelloWorldGuard`.
- Finalmente, se imprime la configuración del sistema BESA en la consola.

### 2. `HelloWorldAgent`

Esta clase representa el agente `HelloWorldAgent`. Sus funciones incluyen:
- **Creación**: A través de un método de fábrica (`createAgent`) que configura el estado y la estructura del agente.
- **Estructura**: Define un comportamiento (`HelloWorldGuard`) y lo vincula con la clase `HelloWorldGuard`.
- **Ciclo de vida**: Incluye métodos para la configuración (`setupAgent`) y apagado (`shutdownAgent`) del agente.

### 3. `HelloWorldGuard`

Esta clase maneja los eventos que recibe el agente. Cuando se recibe un evento, se imprime un mensaje en la consola y se registra un mensaje "Hello World" utilizando el sistema de logs de BESA.

### 4. `HelloWorldState`

Esta clase representa el estado del agente. En este ejemplo básico, no se definen variables de estado específicas, pero la clase está preparada para ser extendida si se requiere.

## Requisitos

- **Java 21 o superior**
- **BESA Framework** (incluido como dependencia en el proyecto)

## Ejecución del Proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/usuario/HelloWorldAgent.git
