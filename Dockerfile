FROM openjdk:11
VOLUME /tmp
EXPOSE 8892
ADD ./target/ms.config.server-0.0.1.jar msaccount.jar
ENTRYPOINT ["java","-jar","/msaccount.jar"]
