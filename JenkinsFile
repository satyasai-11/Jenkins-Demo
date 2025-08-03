pipeline {
    agent any

    stages {
        stage('Cleaning') {
            steps {
                echo '=== CLEANING PROJECT ==='
                bat 'mvn clean'
            }
        }

        stage('Building') {
            steps {
                echo '=== BUILDING PROJECT ==='
                bat 'mvn install'
            }
        }

        stage('Listing Target Folder') {
            steps {
                echo '=== LISTING TARGET FOLDER ==='
                bat 'dir target'
            }
        }

        stage('Running JAR') {
            steps {
                echo '=== RUNNING APPLICATION ==='
                bat '''
                IF EXIST target\\Jenkins-Demo.jar (
                    java -jar target\\Jenkins-Demo.jar
                ) ELSE (
                    echo ERROR: JAR not found!
                    EXIT /B 1
                )
                '''
            }
        }
    }
}
