JC=javac
JA=java

default: env clean complie run
	
clean:
	rm -f *.class
complie:
	$(JC) *.java
run:
	$(JA) TestRunner
