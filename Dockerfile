FROM openjdk:8-jre
ADD . /tmp
WORKDIR /tmp
ENV NAME World
#ARG DEPENDENCY=build/libs/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","ua.com.vitech.internal.sample.devflow.Application"]
