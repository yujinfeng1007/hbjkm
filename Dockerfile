FROM java:8
MAINTAINER yujinfeng 296519653@qq.com
VOLUME /tmp
ADD target/health-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]