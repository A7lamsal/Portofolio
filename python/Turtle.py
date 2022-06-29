
from turtle import *

def position(): #function known as position to set the position of the turtle and to set the background and turtle's color
    bgcolor("blue")
    pencolor("yellow")
    speed(0)
    pensize(1)
    pu()
    goto(-90, 0)
    st()
    pd()
    
    
def spiral(): #function known as spiral to draw the spiral  
    size=40
    position() #invoking the position function
    for i in range(0,300): #A loop to draw the spiral  
        forward(size)
        right(91)
        size+=1

spiral() #invoking the spiral function




