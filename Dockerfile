FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=build/libs/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","ua.com.vitech.internal.sample.devflow.Application", "--spring.security.oauth2.client.registration.cognito-client-1.client-secret=1ioo4f8f55reonq7gb1lapar8hpbmj88scrf50dkkdr0ql1euehp"]
