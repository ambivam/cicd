pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat '''@echo off
			javac Temp.java
			pause
			java Temp
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
