#ifndef MAIN_H
#define MAIN_H

#include "gba.h"

// TODO: Create any necessary structs

/*
* For example, for a Snake game, one could be:
*/


struct player {

    int row;
    int col;
    int rd;
    int cd;
    int clicked;
    int score;
};

struct ball {

    int row;
    int col;
    int rd;
    int cd;
    int size;
};

struct bird_l {

    int row;
    int col;
    int rd;
    int cd;
    int clickedHit;
    int destination;
};



/*
* Example of a struct to hold state machine data:
*
* struct state {
*   int currentState;
*   int nextState;
* };
*
*/

#endif
