def call() {
  withSonarQubeEnv('sonar-scanner') {
                sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Boardgamelist \
                    -Dsonar.projectKey=Boardgamelist -Dsonar.java.binaries=.'''
                   }
}
