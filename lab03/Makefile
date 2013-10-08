CXX=g++
CFLAGS=-c #-Wall
LDFLAGS= 
SOURCES=Lab03.cpp Circle.cpp Quadrilateral.cpp Triangle.cpp Equilateral.cpp Square.cpp Right.cpp Scalene.cpp Rectangle.cpp Shape.cpp 
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=L03.out

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
	$(CXX) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CXX) $(CFLAGS) $< -o $@  

clean: 
	rm -rf $(OBJECTS) $(EXECUTABLE)
