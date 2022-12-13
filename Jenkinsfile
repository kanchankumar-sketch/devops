pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build Maven'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kanchankumar-sketch/devops']]])
               bat 'mvn clean install'
            }
        }
        stage('Biuld Docker Image'){
            steps{
                   script{
                        bat 'docker build -t kanchankumar1sketch/devops-automation .'
                   }
            }
        }
        stage('Push Image to HUb'){
            steps{
                script{
                    bat 'docker login -u kanchankumar1sketch -p vkKC3XLeT$Dcx56 docker.io'
                    bat 'docker push kanchankumar1sketch/devops-automation'
                }
            }
        }
    }
}