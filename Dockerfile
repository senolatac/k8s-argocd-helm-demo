FROM  amazoncorretto:17

WORKDIR /usr/src/app

COPY target/*-SNAPSHOT.jar ./k8s-argocd-server.jar

CMD ["java", "-jar", "/usr/src/app/k8s-argocd-server.jar"]