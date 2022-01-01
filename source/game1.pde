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
  /*fill(p.ccc/100000,125,255-p.ccc/100000);
  rectMode(CORNERS);
  rect(150,0,1000,1200);
  fill(125);
  rect(0,0,150,1000);
  p.pmove();
  p.move();
  p.disp();
 if (mousePressed){
          if ((mouseButton==LEFT)&&(mouseX>275)&&(mouseX<425)&&(mouseY>325)&&(mouseY<400)&&(p.st==0)){
            p=new player(easy.a,easy.regu);
          }
  }*/
  
 gl.disp(); 
}
