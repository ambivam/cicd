pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat 'start cmd.exe /c javac d:\\cicd\\Temp.java'
		
            }
        }
    	stage("Executing Java"){
	    steps{
		echo 'Exceuting ECHO2'			
		bat 'start cmd.exe /c java d:\\cicd\\Temp'
	    }
	}
        
    }
}
