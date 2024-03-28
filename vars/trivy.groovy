def call() {
  sh " trivy fs --format json -o trivy.json .  "
}
