L02.out : Lab02.o aClass.o
	g++ -o L02.out Lab02.o aClass.o

Lab02.o : Lab02.cpp aClass.h
	g++ -g -c Lab02.cpp

aClass.o : aClass.h aClass.cpp
	g++ -g -c aClass.cpp

clean :
	rm *.o L02.out
