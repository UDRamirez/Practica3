FROM eclipse-temurin:23-jdk

WORKDIR /app
COPY . /app

RUN mkdir -p out && javac -encoding UTF-8 -d out $(find src -name "*.java")

CMD ["java", "-cp", "out", "App"]