FROM eclipse-temurin:20-jdk-alpine
COPY target/*.jar app.jar
Copy applicationinsights.json applicationinsights.json
COPY applicationinsights-agent-3.4.11.jar agent.jar
ENTRYPOINT ["java", "-javaagent:agent.jar", "-jar", "./app.jar"]