# spring-boot-k8s
Spring Boot, Docker deployed on Kubernetes cluster 



# Maven Commands

- clean project => mvn clean
- compile project => mvn compile
- install the dependencies => mvn install
- create jar => mvn package


**** Before creating docker image run mvn package****


# Docker Commands

- Create local image => docker build -t subhendugn/spring-boot-k8s:v1 . 


- Run the image => docker run -p 8070:8070 -it subhendugn/spring-boot-k8s:v1

- Detachale mode => docker run -d -p 8070:8070 -it subhendugn/spring-boot-k8s:v1

After running image locally, it will create containes

- To check all the active containers => docker ps -a

- Push the image to docker hub - docker push subhendugn/spring-boot-k8s:v1
