FROM openjdk:8-jdk-alpine
WORKDIR /
ADD ./target/config-service-0.0.1-SNAPSHOT.jar config-service.jar
EXPOSE 8888
ENV ipAddress localhost
CMD java -XX:+PrintFlagsFinal $JAVA_OPTIONS \
		 -Dcom.sun.management.jmxremote=true \
 		 -Dcom.sun.management.jmxremote.local.only=false \
		 -Dcom.sun.management.jmxremote.authenticate=false \
		 -Dcom.sun.management.jmxremote.ssl=false \
		 -Dcom.sun.management.jmxremote.port=8881 \
		 -Dcom.sun.management.jmxremote.rmi.port=8881 \
		 -Djava.rmi.server.hostname=ipAddress \		 
		 -jar config-service.jar