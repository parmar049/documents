to start streaming hit URL

localhost:8080/coopX/v1/streamTweets/produceDataStream?ruleFilter=modi

to start Kafka server use command

.\bin\windows\kafka-server-start.bat .\config\server.properties

Improvements :::
    
   
3. Add test case to test producer code, consume and test in unit test   
4. Implementation of docker
5. Integration with AWS to get token from AWS parameter store instead of Hardcoding   
6. Build CI/CD pipeline to deploy in cloud
7. Implementation of authentication with Kafka broker


To start jenkins in docker
docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts-jdk11


Points for PPT Preparation :
    1. How we can install Kafka , by Own in EC2 but had problesm

https://www.youtube.com/watch?v=HtU9pb18g5Q

https://www.youtube.com/watch?v=lOdrdV0eDrs

https://www.youtube.com/watch?v=z7_LdCVnCRU