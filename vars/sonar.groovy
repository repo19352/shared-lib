def call() {
  withSonarQubeEnv('sonar-server') {
                sh '''$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Boardgamelist \
                    -Dsonar.projectKey=Boardgamelist -Dsonar.java.binaries=.'''
                   }
}
