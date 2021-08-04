pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat '''@echo off
			javac d://cicd//Temp.java
			sleep 10
			java d://cicd//Temp
			sleep 10'''
		
            }
        }
    	stage("Executing Java"){
	    steps{
		echo 'Exceuting ECHO2'	
	    }
	}
        
    }
}
