### Create a Jenkins Shared Library

### Technologies used:
Jenkins, Groovy, Docker, Git, Java, Maven

### Project Description
Create a Jenkins Shared Library to extract common build logic

1-Create separate Git repository for Jenkins Shared Library project.

2-Create functions in the JSL to use in the Jenkins pipeline.

3-Integrate and use the JSL in Jenkins Pipeline for global.

4-Integrate and use the JSL in Jenkins Pipeline for a specific project in Jenkinsfile.

### Usage Instructions:

###### Step 1: Create a groovy class using package inside src folder
![image](image/Screenshot%202023-02-23%20at%2011.50.14%20pm.png?raw=true)
###### Step 2: Import created package and new instance based on groovy class
#Create buildJar function
![image](image/Screenshot%202023-02-23%20at%2011.56.04%20pm.png)
#Create buildDockerImage function
![image](image/Screenshot%202023-02-23%20at%2011.56.13%20pm.png)
#Create dockerLogin function
![image](image/Screenshot%202023-02-23%20at%2011.56.19%20pm.png)
#Create dockerPush function
![image](image/Screenshot%202023-02-23%20at%2011.56.25%20pm.png)
###### Step 3: Configure the Jenkins shared library in Jenkins UI for global usage
![image](image/Screenshot%202023-02-24%20at%2012.01.41%20am.png)
###### Step 4: Import the jenkins shared library inside Jenkinsfile for a project
![image](image/Screenshot%202023-02-24%20at%2012.05.08%20am.png)
###### Step 5: Configure the Jenkins shared library in Jenkins UI for specific project usage
![image](image/Screenshot%202023-02-24%20at%2012.08.07%20am.png)

