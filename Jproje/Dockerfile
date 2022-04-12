FROM openjdk:11
COPY ./Jproje/src/main/java/com/dummy/Dummy.java /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Dummy.java
CMD ["java", "Dummy"]