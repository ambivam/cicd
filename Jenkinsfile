pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat '''mvn clean test'''
		
            }
        }        
    }
}
