FROM openjdk:8
ADD C:/Users/flore/OneDrive/Bureau/rendu.jar rendu.jar
CMD ["java", "-jar", "rendu.jar"]
EXPOSE 8080
