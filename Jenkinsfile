pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat """start cmd.exe /c javac d:\\cicd\\Temp.java & java d:\\cicd\\Temp"""
		
            }
        }
    	stage("Executing Java"){
	    steps{
		echo 'Exceuting ECHO2'	
	    }
	}
        
    }
}
