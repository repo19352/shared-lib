def call() {
                  dependencyCheck additionalArguments: '--scan target/',odcInstallation: 'owasp'
                    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
