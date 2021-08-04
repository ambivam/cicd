pipeline{
    agent any
    stages{
	stage("Executing Java Testng Suites"){
            steps{
		echo 'Exceuting ECHO1'	
		bat 'start cmd.exe /c javac d:\\cicd\\Temp.java'
		
            }
        }
    	stage("Executing Java Testng Suites"){
	    steps{
		echo 'Exceuting ECHO2'			
		bat 'start cmd.exe /c java d:\\cicd\\Temp'
	    }
	}
        
    }
}
