FROM eclipse-temurin:21-jdk

WORKDIR /estoque-de-produtos

COPY . .

RUN javac -d out src/*.java src/entities/*.java src/interfaces/*.java

CMD ["java", "-cp", "out", "Main"]