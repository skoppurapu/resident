# Resident Application - Setup Guide

# Pre-requisites
## IDE
- Use IntelliJ Community Edition as a preferred IDE. But you can use any other IDE that you are most familiar with if thats your preferred choice.
 - Windows:
https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC
- Mac: https://www.jetbrains.com/idea/download/download-thanks.html?platform=mac&code=IIC

## Java
- Setup jdk version 11.
- https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
- Since this is for personal/development use, there should not be any concerns in downloading and using it.

## GitHub Access
- Setup and account with GitHub - https://github.com/signup?source=login
- Login to Github: https://github.com/login
- Create a personal access token by following this guide: https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#creating-a-personal-access-token-classic
- In "Select Scopes", choose ```repo```.
- Copy the access token and save it in a secured place.

## Install git
- https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
- Verify installation by running ```git --version``` from command prompt/terminal.

# Setup workspace
## Clone repository (onetime)
- Navigate to the folder where you want to setup the project
```shell script
cd /kspreddy/workspace
```
- Run the clone command
```shell script
git clone https://github.com/skoppurapu/resident.git
```
Note: If asked for credentials, use the email id on your git hub account and enter the personal access token.

-You should now see the code checked out into your local machine.

## Setup project in IDE (these instructions are for IntelliJ)
- Select Open Project and choose the downloaded ```resident``` folder.
- Go to ```File -> Project Structure -> Project``` and verify that java version is set to 11. If not, update it to 11.
- Go to ```File -> Project Structure -> Modules``` and verify that java version is set to 11 under ```Sources``` and ```dependencies``` tabs. If not update the settings.
- Go to ```IntelliJ IDEA -> Preferences - Build, Execution, Deploy```
- Click on ```Add Configuration``` on the top right menu. Click on + icon and select Maven. Then in the command options enter ```clean spring-boot:run```
- Click on OK. You should now see this option and a run button against it.
- Click on the run button. You should see a successful build and run logs on the console. Something that ends with the below lines:
```shell script
2023-07-29 13:31:02.578  INFO 52219 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2023-07-29 13:31:02.619  INFO 52219 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-07-29 13:31:02.636  INFO 52219 --- [  restartedMain] c.h.c.resident.ResidentApplication       : Started ResidentApplication in 2.345 seconds (JVM running for 2.752)
```

## Verify Application
You can verify if the application is successfully running by doing either or both of the below:
 - Check actuator endpoint
 ```
http://localhost:8080/actuator
```
- Check Ping (sample endpoint). Should return Success message.
```shell script
http://localhost:8080/ping
```
- Basic project setup is complete when you see the Success message.

# Code Repository
It is recommended to push any tested and working code into repository. To do this, follow the below steps:
1. Check the list of files that have a code change using:
```git status```
2. Selectively, add files to commit using:
```git add <file1> <file2> ...```
3. Commit the changes locally using: ```git commit -m "commit message: description of changes"```
4. Push the changes to remote (note that unless this step is complete changes will not be visible on the remote server): ```git push```
5. Verify the changes on the remote server: https://github.com/skoppurapu/resident