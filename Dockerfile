FROM openjdk:alpine
COPY QuadraticEquationSolver.java /usr/src/testjava/
WORKDIR /usr/src/testjava/
RUN javac QuadraticEquationSolver.java
ENTRYPOINT ["/usr/bin/java", "QuadraticEquationSolver"]
CMD ["1", "2", "-3"]
