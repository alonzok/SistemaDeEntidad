# Sistema de Entidad

Proyecto escrito en Java utilizando el framwork de SpringBoot. Este proyecto es parte de un trabajo de Tesis nombrado "Desarrollo de Portales para Acceder a la Dimensión Aumentada". Este proyecto se encarga de la manipulación de los ecosistemas digitales aumentados y entidades digitales aumentados para el concepto de la dimensión aumentada. 

## Características

- Arquitectura basada en Spring Boot.
- Gestión de entidades digitales aumentadas.
- Manipulación de ecosistemas digitales aumentados.
- Extensible y fácil de mantener.

## Requisitos

- Java 17 o superior
- Maven 3.8+
- Spring Boot 3.x

## Instalación

1. Clona el repositorio
2. Compila el proyecto
3. Ejecuta la aplicación


## Uso

Una vez iniciada la aplicación, puedes acceder a las funcionalidades principales a través de la API REST expuesta por el sistema.

## API REST expuestas

- GET getAllActuador
- GET getActuador/{id}
- GET setActiveActuador
- DELETE deleteActuador/{id}
- Post postEcosistemaUbicacion
- POST postEcosistemaMarcador
- POST upload
- POST postEcosistemaDigitalAumentado
- GET getAllEcosistema
- GET getEcosistema/{id}
- DELETE deleteEcosistema/{id}
- GET ecosistemaDigital/getJSON/{type}
- POST postEntity
- GET getAllEntity
- GET getEntity/{id}
- GET getEntityByEcosistema/{id}