java: depen
	java Main

depen: *.java
	javac *.java

cpp: main
	./a.exe

main: main.cpp
	g++ main.cpp

clean:
	rm *.exe
	rm *.class