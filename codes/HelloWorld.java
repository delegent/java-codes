package world;
public class HelloWorld{

public static void main(String [] args){
	System.out.println("Hello World");
}


}
/*
sriva@DESKTOP-NLAPTLF MINGW64 /d/Professional/java/codes
$ javac HelloWorld.java 

sriva@DESKTOP-NLAPTLF MINGW64 /d/Professional/java/codes
$  java HelloWorld
Error: Could not find or load main class HelloWorld
Caused by: java.lang.NoClassDefFoundError: world/HelloWorld (wrong name: HelloWorld)

sriva@DESKTOP-NLAPTLF MINGW64 /d/Professional/java/codes
$ javac -d . HelloWorld.java

sriva@DESKTOP-NLAPTLF MINGW64 /d/Professional/java/codes
$ java world.HelloWorld
Hello World

sriva@DESKTOP-NLAPTLF MINGW64 /d/Professional/java/codes
$


*/