![springboot](https://img.shields.io/badge/SpringBoot-v3.3.4-blue)
![microsoft](https://img.shields.io/badge/Microsoft-yellowgreen)
![linux](https://img.shields.io/badge/Linux-yellowgreen)
![jap](https://img.shields.io/badge/Spring_Data_JPA-success)
![web](https://img.shields.io/badge/Spring_Boot_Web-success)
![h2](https://img.shields.io/badge/H2_Database-success)
![lombok](https://img.shields.io/badge/Lombok-success)
![hibernate](https://img.shields.io/badge/Hibernate-success)
![maven](https://img.shields.io/badge/Maven-v3.9.8-important)

# Spring Boot Restfull (v1.0)

Api creado para registro de usuario, H2 para BD, CRUD JPA e Hibernate.

## Instalación

1. Abrir con su ID preferido e instalar las dependencias.

2. El proyecto ya genera 5 registros desde el inicio, se puedo modificar ya que se encuentran en un archivo sql dentro de la carpeta resource.

3. **Ejemplo de código para crear un nuevo usuario**
    ```
    {
        "name": "Alonso Gómez",
        "email": "alonso.gom@gmail.com",
        "password": "$Passwor123",
        "phones": [
            {
                "number": "987456587",
                "citycode": "10",
                "countrycode": "52"
            },
            {
                "number": "963258745",
                "citycode": "15",
                "countrycode": "53"
            }
        ]
    }
    ```

## Uso

Para poder revisar los endpoint, se adjunta en la ruta raiz un archivo ***.postman_collection.json** para que se pueda importar en postman y poder probar los endpoints.

## Recomendaciones

- El aplicativo aun esta en desarrollo, se sigue implementando nuevas librerías y actualizaciones.
- No olvidar que cada peticion se debe agregar el JWT para que pueda funcionar los métodos.