mvn clean compile assembly:single
mvn test
java -jar fss-client-jar-with-dependencies.jar $1