### Kubernates + ArgoCD + Helm + SpringBoot

### Installation Steps
- Install helm: https://helm.sh/docs/intro/install/
- Install k8s: https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/
- Install kind: https://kind.sigs.k8s.io/docs/user/quick-start/
- Install micro-k8s: https://microk8s.io/docs/install-macos
- Install argo-cd: https://argo-cd.readthedocs.io/en/stable/getting_started/
- Install k9s: https://k9scli.io/topics/install/

### Install ArgoCD Manifests
````
kubectl apply -f repo-creds.yaml
kubectl apply -f repository.yaml
kubectl apply -f project.yaml
kubectl apply -f application.yaml
````

### Install ingress-nginx
- https://stackoverflow.com/questions/72229854/helm-charts-and-ingress-resources
- https://github.com/argoproj/argo-cd/issues/1704
````
helm install sha-nginx-1 ingress-nginx/ingress-nginx -f charts/ingress-values.yaml --namespace argocd
````