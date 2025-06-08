# Etapa 1: construir la app
FROM gradle:8.2.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build -x test

# Etapa 2: imagen final
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copiamos el JAR compilado
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

# Exponer puerto (Spring Boot usa 8080 por defecto)
EXPOSE 8080

# Comando para correr la app
ENTRYPOINT ["java", "-jar", "app.jar"]