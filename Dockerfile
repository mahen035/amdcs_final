FROM openjdk

MAINTAINER mahen518

WORKDIR /app

COPY target/java-basics.jar /app/java-basics.jar

ENTRYPOINT ["java", "-jar", "java-basics.jar"]
