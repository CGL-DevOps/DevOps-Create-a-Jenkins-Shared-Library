#!/var/bin/env groovy

def call(){
    echo "building java jar file from $BRANCH_NAME"
    sh "mvn package"
}