# Use the official maven/Java 8 image to create a build artifact: https://hub.docker.com/_/maven
FROM maven:3.8.6-openjdk-11 as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY api ./api
COPY core ./core
COPY server ./server

# Build a release artifact.
RUN mvn package -DskipTests -Drevision=1.0.0-SNAPSHOT

# Use the Official OpenJDK image for a lean production stage of our multi-stage build.
# https://hub.docker.com/_/openjdk
# https://docs.docker.com/develop/develop-images/multistage-build/#use-multi-stage-builds
FROM openjdk:11-jre

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/server/target/backend-server-bootified.war /backend-server-bootified.war

# Run the web service on container startup.
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/backend-server-bootified.war"]
