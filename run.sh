cd src/
echo "Compiling project..."
javac *.java
echo "Registring RMI on port 1410..."
set -e rmiregistry 1410 &
echo "Starting server..."
rmic -vcompat ToolStudentServer

java Server
