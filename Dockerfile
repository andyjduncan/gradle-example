# Use an official OpenJDK 17 runtime as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built jar file into the container
COPY build/libs/gradle-example-all.jar /app/app.jar

# Expose any required port (optional, depending on the application)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
