int xPos=300,yPos=100;
final int SIZE_FACTOR = 100;
int eyes = 3;
size(500,500);

ellipseMode(CENTER);
fill(255,223,196);
ellipse(xPos,yPos,SIZE_FACTOR*2,SIZE_FACTOR*2);
//first eye
fill(255);
if(eyes != 1){
ellipse(xPos-50,yPos-30,SIZE_FACTOR/2,SIZE_FACTOR/4);
}
//second eye
if(eyes != 1){
ellipse(xPos+50,yPos-30,SIZE_FACTOR/2,SIZE_FACTOR/4);
}
//third eye
if(eyes == 3){
ellipse(xPos,yPos-80,SIZE_FACTOR/2,SIZE_FACTOR/4);
}else if (eyes == 1){
ellipse(xPos,yPos-40,SIZE_FACTOR/2,SIZE_FACTOR/4);
}
