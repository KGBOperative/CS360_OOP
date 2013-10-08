CXX=g++
CFLAGS=-c -Wall
LDFLAGS= 
SOURCES=Lab02.cpp Circle.cpp Scalene.cpp Rectangle.cpp Shape.cpp 
#HEADERS=Shape.h
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=L02.out

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
	$(CXX) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CXX) $(CFLAGS) $< -o $@ # $(HEADERS) 

clean: 
	rm -rf $(OBJECTS) $(EXECUTABLE)
