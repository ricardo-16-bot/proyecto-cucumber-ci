pipeline {
    agent any

    tools {
        maven 'Maven 3'  // Nombre del Maven configurado en Jenkins (ajustar si es diferente)
        jdk 'JDK 11'     // Nombre del JDK configurado en Jenkins
    }

    environment {
        MAVEN_OPTS = "-Dmaven.repo.local=.m2/repository"
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Descargando código...'
                checkout scm
            }
        }

        stage('Ver Java') {
                    steps {
                        sh 'java -version'
                    }
                }

        stage('Instalar dependencias') {
            steps {
                echo 'Instalando dependencias...'
                sh 'mvn clean compile'
            }
        }

        stage('Ejecutar pruebas') {
            steps {
                echo 'Ejecutando pruebas Cucumber...'
                sh 'mvn test'
            }
        }

        stage('Generar Reportes') {
            steps {
                echo 'Generando reportes...'
                // Si usas plugins para generar HTML, puedes añadir comandos aquí.
                // Maven puede generar automáticamente reportes en target/cucumber-reports
            }
        }

        stage('Publicar Reportes') {
            steps {
                publishHTML([
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'report.html',
                    reportName: 'Reporte de Pruebas Cucumber'
                ])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            echo 'Pipeline finalizado.'
        }
    }
}
