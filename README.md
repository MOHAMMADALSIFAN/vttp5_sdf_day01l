# Complie instructions for Java

# cd bin
// jar -c -v -f hWorld.jar -e  myapp.HelloWorld .
// java -jar hWorld.jar myapp.HelloWorld
String[] cmd = { "/bin/sh", "-c", "cd /var; ls -l" };

Scanner object Point - 
Array List to store few words
keyboard input to be a sentence 
scanner object to break the sentence into words
put the words into the array list[1]

compile to bin and run 
javac --source-path myapp -d bin myapp/*.java
java -cp bin myapp.HelloWorld

compile in same folder and run
javac myapp/HelloWorld.java
java myapp.HelloWorld