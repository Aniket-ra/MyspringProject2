FROM maven:3.9.8-openjdk-21 AS build
copy . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/demoEmployeeManagement-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","demo.jar"]
