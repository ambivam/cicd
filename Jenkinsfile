pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat 'start cmd.exe /c d:\cicd\testsuite.bat'
		
            }
        }
    	stage("Executing Java"){
	    steps{
		echo 'Exceuting ECHO2'	
	    }
	}
        
    }
}
