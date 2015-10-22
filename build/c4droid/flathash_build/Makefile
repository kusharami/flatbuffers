###

INC = ../../../include
SRC = ../../../src

INCLUDE = \
	-I$(INC)

SRC_H = \
	$(wildcard $(INC)/*.h)
	
SRC_CPP = \
	$(subst $(SRC)/flatc.cpp,, \
	$(wildcard $(SRC)/*.cpp))
	
	
OBJ = $(SRC_CPP:.cpp=.o)

DEFINES = -DANDROID -D__ANDROID__
WARNINGS = -Wall -Wfatal-errors
CPP_FLAGS = $(CXX_FLAGS) $(INCLUDE) $(DEFINES) $(WARNINGS)
CXX_FLAGS = -std=c++11 -lstdc++ -frtti -fexceptions
DROID_FLAGS = -landroid
LINK_FLAGS = $(CXX_FLAGS) $(DROID_FLAGS) -Wl,--no-undefined

BIN = flathash

all: $(BIN)

$(BIN): $(OBJ)
	@echo $(BIN)
	$(CXX) $(OBJ) $(LINK_FLAGS) -o $(BIN)
	
clean:
	@echo Removing: $(OBJ)
	rm $(BIN) $(OBJ)

%.o: %.cpp $(SRC_H)
	@echo $< $@
	$(CXX) $(CPP_FLAGS) -c $< -o $@