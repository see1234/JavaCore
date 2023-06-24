FROM bellsoft/liberica-openjdk-alpine

COPY ./src /sourceMyContainer

RUN javac -sourcepath ./sourceMyContainer -d out sourceMyContainer/Main.java
RUN mkdir /sourceMyContainer/docs
RUN javadoc -d /sourceMyContainer/docs /sourceMyContainer/*.java
#CMD java --version
CMD java -classpath ./out Main