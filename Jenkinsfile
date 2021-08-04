pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat '''@echo off
			javac d://cicd//Temp.java
			pause
			java d://cicd//Temp
			pause'''
		
            }
        }
    	stage("Executing Java"){
	    steps{
		echo 'Exceuting ECHO2'	
	    }
	}
        
    }
}
