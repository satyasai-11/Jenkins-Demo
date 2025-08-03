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


    }
}
