How to run this automation project:
pre-requirements:
1 - Install an IDE, I suggest using InteliJ
2 - Install java 11. Here are my Java configs:
2.1 - java version "11.0.21" 2023-10-17 LTS
2.2 - Java(TM) SE Runtime Environment 18.9 (build 11.0.21+9-LTS-193)
2.3 - Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.21+9-LTS-193, mixed mode)
3 - Configure environment variables
3.1 - Set or create variable: JAVA_HOME, set value: C:\Program Files\Java\jdk1.8.0_271
3.2 - Set or create variable: MAVEN_HOME, set value: C:\apache-maven-3.6.3
3.3 - on variable "Path" create new and paste "%JAVA_HOME%\bin"
3.3 - on variable "Path" create new and paste "%MAVEN_HOME%\bin"

Open the IDE
Open the project
At the right side on the maven menu click at the letter M
run: "mvn clean install" and wait the download.
Go to the Runner class src -> test -> Java -> runner -> Runner
on the line 15 (public class Runner) there should be a play button.
Click on the play button and the scenarios should execute.



