CXX=g++
CFLAGS=-c -Wall
LDFLAGS= 
SOURCES=Lab01.cpp Circle.cpp Triangle.cpp Rectangle.cpp
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=L01.out

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
	$(CXX) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CXX) $(CFLAGS) $< -o $@

clean: 
	rm -rf $(OBJECTS) $(EXECUTABLE)
