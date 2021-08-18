pipeline{
    agent any
    stages{
	stage("Compiling Java"){
            steps{
		echo 'Exceuting ECHO1'	
		bat '''@echo off
			javac SuiteGen.java
			pause
			java SuiteGen
			pause'''
		
            }
        }        
    }
}
