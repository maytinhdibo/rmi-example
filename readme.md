# Service Oriented Architecture
## RMI example project
| Student ID | Fullname         |
|------------|------------------|
| 17020076   | Tran Manh Cuong  |
| 17020077   | Nguyen Ngoc Dang |
| 17020951   | Do Hong Phong    |

## Source code
[Github repo](https://github.com/maytinhdibo/rmi-example)

## How to run
### Linux:
- Clone this project
- Run ```chmod +x run.sh```
- Then ```./run.sh```. You should see "Server is running" on terminal screen
- Open new terminal run ```cd src/ && java Client```

The output should should be below:
+ on Server:
```
user@dangnn:~/Desktop/rmi/rmi-example$ ./run.sh 
Compiling project...
Registring RMI on port 1410...
Starting server...
Server is running
Searching (ID: 17020077)....
Searching (ID: 17020076)....
Searching (ID: 17020078)....
Searching (ID: 1233)....
```
+ on Client:
```
dang@dangnn:~/Desktop/rmi/rmi-example/src$ java Client 
Please enter student number, type -1 to exit: 17020077
Result: | 17020077      Ngoc Dang       62CLC   14/08/1999      Nghe An |
Please enter student number, type -1 to exit: 17020076
Result: | 17020076      Cuong Tran      62CLC   14/10/1999      Nghe An |
Please enter student number, type -1 to exit: 17020078
Result: | 17020078      Do Phong        62CLC   12/01/1999      Ha Noi |
Please enter student number, type -1 to exit: 1233
Result: Student not found
Please enter student number, type -1 to exit: -1
Application is closed.
```

### Windows

Run following command to start server:
```
cd src/
javac *.java
start rmiregistry 1410
rmic -vcompat ToolStudentServer
java Server
```
- Then open new terminal run ```cd src/ && java Client```
