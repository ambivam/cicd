pipeline{
    agent any
    stages{
	stage("Executing Java Testng Suites"){
            steps{
		echo $PWD
                sh "javac Temp.java"
		sh "java Temp"
            }
        }
        
    }
}
