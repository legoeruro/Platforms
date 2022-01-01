PFont pp;
PFont pa;
PFont pc;
mm gl;
void setup(){
  size(750,650);
  pp=createFont("calibri",50,false);
  pa=createFont("ariel",50,false);
    pc=createFont("ariel",50,true);
  gl=new mm();
}
void draw(){
 gl.disp(); 
}
