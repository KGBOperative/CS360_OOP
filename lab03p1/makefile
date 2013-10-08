L03.out : Lab03.o aClass.o
	g++ -o L03.out Lab03.o aClass.o

Lab03.o : Lab03.cpp aClass.h
	g++ -g -c Lab03.cpp

aClass.o : aClass.h aClass.cpp
	g++ -g -c aClass.cpp

clean :
	rm -f *.o L03.out

run : 
	./L03.out Lab03.input
