FROM eclipse-temurin:21-jdk

WORKDIR /estoque-de-produtos

COPY . .

RUN javac -d out src/*.java src/entities/*.java

CMD ["java", "-cp", "out", "Main"]