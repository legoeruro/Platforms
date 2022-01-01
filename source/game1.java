import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class game1 extends PApplet {

PFont pp;
PFont pa;
PFont pc;
mm gl;
public void setup(){
  
  pp=createFont("calibri",50,false);
  pa=createFont("ariel",50,false);
    pc=createFont("ariel",50,true);
  gl=new mm();
}
public void draw(){
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
class diffi{
  int a;
  int r;
  int c;
  diffi(int aa,int rr,int cc){
    c=cc;
    a=aa;
    r=rr;
  }
}
class mm{
  player p;
  PVector pos=new PVector(275,10);
  float sped=1;
  final diffi e=new diffi(1,100,color(135,252,103));
  final diffi n=new diffi(2,250,color(249,211,72));
  final diffi h=new diffi(3,400,color(242,38,38));
  diffi fid=new diffi(2,250,color(248,211,72));
  int i=1;
  int s=1;
  int z=0;
  int ppc=0;
  int m=color(125);
  long count=0;
  int zb=0;
  mm(){
    p=new player(fid.a,fid.r);
    textFont(pc,50);
    textFont(pp,50);
    frameRate(60);
    
  }
  public void disp(){
    if (s==1){
      if (ppc!=1){
        pos=new PVector(275,10);
        sped=1;
        count=0;
        ppc=1;
      }
      count++;
        pos.y+=sped;
        if (pos.y>125){
          sped-=0.26f;
        }else{
          sped=sped+0.2f;
        }
      rectMode(CORNERS);
      fill(0, 145, 106);
      rect(0,0,1000,1000);
      p.pmove(false);
      textFont(pp,50);
      fill(43, 0, 86);
      text("Platforms",pos.x,pos.y);
      rectMode(CORNERS);
      if (count>50){
        if ((mouseY>270)&&(mouseY<300)&&(mouseX>320)&&(mouseX<418)){
         fill(125,255,0,75);
         rect(290,240,445,325);
         fill(43, 0, 86);
         text("Start",315,300);
        }else{
         textFont(pp,45);
         fill(125,255,0,75);
         rect(300,250,440,320);
         fill(43, 0, 86);
         text("Start",325,300);
        }
      }
      if (count>175){
        //text("Instructions",250,400);
        if ((mouseX>230)&&(mouseX<490)&&(mouseY>350)&&(mouseY<420)){
         textFont(pp,50);
         fill(125,255,0,75);
         rect(220,345,525,430);
         fill(43, 0, 86);
         text("Instructions",250,400);
        }else{
         textFont(pp,45);
         fill(125,255,0,75);
         rect(230,350,490,420);
         fill(43, 0, 86);
         text("Instructions",250,400);
        }
      }
      if ((mouseY>270)&&(mouseY<300)&&(mouseX>320)&&(mouseX<418)&&(mousePressed)&&(mouseButton==LEFT)){
        s=2;
        rectMode(CORNERS);
        fill(m);
        rect(0,0,1000,1000);
      }else if ((mouseY>370)&&(mouseY<400)&&(mouseX>320)&&(mouseX<418)&&(mousePressed)&&(mouseButton==LEFT)){
        s=4;
      }
    }
  if (s==4){
    rectMode(CORNERS);
    ppc=0;
    textFont(pp,45);
    fill(0,183,128);
    rect(0,0,1000,1000);
    fill(249,0,116);
    text("Use arrow keys to move,spacebar to fly",20,40,680,650);
    fill(249,0,53);
    text("Try not to hit the spikes or you will fail!",20,160,680,650);
    if ((mouseX>10)&&(mouseX<130)&&(mouseY>560)&&(mouseY<610)){
      textFont(pp,50);
     fill(52,0,183,99);
    rect(5,555,150,615);
    fill(0,183,128);
    text("BACK",20,600);
    if ((mousePressed)&&(mouseButton==LEFT)){
      s=1;
     }
    }else{
     fill(52,0,183,99);
    rect(10,560,130,610);
    fill(0,183,128);
    text("BACK",20,600); 
    }
  }
  if (s==3){
    ppc=0;
  if (z==1){
  rectMode(CORNERS);
  rect(150,0,1000,1200);
  fill(125);
  rect(0,0,150,1000);
  p.pmove(true);
  p.move();
  p.disp();
 if (mousePressed){
          if ((mouseButton==LEFT)&&(mouseX>275)&&(mouseX<425)&&(mouseY>325)&&(mouseY<400)&&(p.st==0)&&(p.st==0)){
            p=new player(fid.a,fid.r);
          }else if((mouseX>275)&&(mouseX<425)&&(mouseY>425)&&(mouseY<500)&&(p.st==0)){
            ppc=0;
            s=1;
          }
   }
  }else{
    z=1;
    p=new player(fid.a,fid.r);
  }
  }
  if (s==2){
    ppc=0;
      if (zb==1){
      p.pmove(false);
      }
    if (count+20<frameCount){
    z=0;
    textAlign(CENTER);
    textFont(pp,50);
    rectMode(CORNERS);
    fill(m,25);
    rect(0,0,1000,1000);
    fill(e.c);
    rect(200,50,525,140);
    fill(0);
    text("EASY",362.5f,110);
    fill(n.c);
    rect(200,285,525,375);
    fill(0);
    text("NORMAL",362.5f,345);
    fill(h.c);
    rect(200,500,525,590);
    fill(0);
    text("HARD",362.5f,560);
    textAlign(LEFT);
    if ((mouseX>200)&&(mouseX<525)&&(mouseY>50)&&(mouseY<140)){
      if ((fid!=e)){
      zb=1;
      fid=e;
      p=new player(fid.a,fid.r);
      m=fid.c;
      }
      if ((mousePressed)&&(mouseButton==LEFT)){
        s=3;
      }
    }else if ((mouseX>200)&&(mouseX<525)&&(mouseY>285)&&(mouseY<375)){
      if(fid!=n){
      zb=1;
      fid=n;
      p=new player(fid.a,fid.r);
      m=fid.c;
      }
      if ((mousePressed)&&(mouseButton==LEFT)){
        s=3;
      }
    }else if ((mouseX>200)&&(mouseX<525)&&(mouseY>500)&&(mouseY<590)){
      if (fid!=h){
      zb=1;
      fid=h;
      p=new player(fid.a,fid.r);
      m=fid.c;
      }
      if ((mousePressed)&&(mouseButton==LEFT)){
        s=3;
      }
    }
    
    }
  }
  }
}
class plat{
  PVector size= new PVector();
  PVector pos=new PVector();
  int c=color(random(125,200),random(125,200),random(125,200));
  int d;
  plat(int diff,long count,boolean b){
    pos.y=random(650,850);
    size.x= 250/diff/round(count/10000.1f+1);
    if (b){
    pos.x=random(150+size.x,width-size.x);
    }else{
      pos.x=random(size.x,width-size.x);
    }
    size.y=40;
    d=diff;
  }
  public void up(long count){
    pos.y=pos.y-2*(count/10000.1f+1)*d;
  }
  public void disp(long count){
     String cc=nf(count);
     fill(c);
     rectMode(CENTER);
     rect(pos.x,pos.y,size.x,size.y);
     textAlign(CENTER);
     textFont(pa,20);
     fill(blue(c)-50,red(c)-50,green(c)-50);
     text(cc,pos.x,pos.y);
     textAlign(LEFT);
  }
}
class player{
 PVector pos=new PVector();
 PVector speed=new PVector();
 plat[] p=new plat[100000000];
 int di;
 int k;
 int reg;
 int f=1000;
 int st;
 int to;
 long count;
 long ccc;
 String score;
 int c=color(random(100,200),random(100,200),random(100,200),70);
 player(int d,int r){
   st=1;
   ccc=1;
   score="0";
   pos.add(250,159);
   speed.add(5,4);
   di=d;
   k=1;
   for (int i=0;i<50;i++){
     ccc=ccc+1;
     p[i]=new plat(di,5,true);
   }
   reg=r;
 }
 public int checkb(){
   
   for (int i=to;i<k;i++){
     if ((pos.x>=p[i].pos.x-(p[i].size.x/2))&&(pos.x<=p[i].pos.x+(p[i].size.x/2))&&(pos.y-10>p[i].pos.y-40)&&(pos.y+10<p[i].pos.y+20)){
       return(i);
     }
   }
   return(-1);
   }
   //pmove
   public void pmove(boolean checc){
  score=nf(ccc);
  to=k-20;
  if (to<0){
   to=0; 
  }
  for (int i=to;i<k+1;i++){
    p[i].up(ccc);
    p[i].disp(PApplet.parseInt(i));
  }
  if (p[k].pos.y<600){
    k++;
    p[k]=new plat(di,ccc,checc);
  }
  if (k>100000000){
   k=2; 
}
  if (k%100==0){
    c=color(random(100,200),random(100,200),random(100,200),70);
  }
  }
   
   //mov
  public void move(){


    int z=0;
    speed.x=speed.x+(ccc/1000000.1f);
    int cc=checkb();
    score=nf(ccc);
    if (st==1){
          ccc=ccc+2;
    if (keyPressed){
      if (keyCode==LEFT){
        if (pos.x>170){
          pos.x=pos.x-speed.x;
      }else{
        pos.x=170;
       }
       
     }else if(keyCode==RIGHT){
         if (pos.x<width-2){
          pos.x=pos.x+speed.x;
      }else{
        pos.x=width-2;
       }
      }else if(((key==32)||((mousePressed)&&(mouseButton==LEFT)))&&(f>20)){
        z=1;
        for (int i=0;i<25;i++){
             
            pos.y=pos.y-0.5f;
            f=f-1;
            rectMode(CENTER);
            if (i>10){
              fill(c);
            }else{
              fill(255,155,25,75);
            }
            
            rect(pos.x,pos.y,20,20);          
        }
      }
      
    }
    if ((cc!=-1)&&(z==0)) {
        pos.y=p[cc].pos.y-30;
      }else{
        pos.y=pos.y+speed.y;
      }
    if ((z==0)){
      f=f+5;
    }
    if (f>1000){
     f=1000;
    }
    noFill();
    stroke(0);
    rectMode(CORNERS);
    rect(0,350,150,650);
    noStroke();
    fill(10,150);
    rect(0+1,650-(f/3.333f)+1,150,650);
    fill(0);
    strokeWeight(10);
    fill(0);
    rect(150,-100,159,1000);
    rectMode(CENTER);
    strokeWeight(1);
    stroke(0);
    textFont(pp,20);
    rectMode(CORNERS);
    text(score,12,20,300,300);
    rectMode(CENTER);
    fill(c);
    rect(pos.x,pos.y,20,20);
    if ((pos.y>600)||(pos.y<50)){
      st=0;
    }
    }else{
      if (count==0){
        count=frameCount;
      }
      rectMode(CORNERS);
      fill(0,125,255);
      rect(0,0,1000,1000);
      pmove(false);
      rectMode(CORNERS);
      fill(0,125,255,75);
      rect(0,0,1000,1000);
      fill(0);
      textFont(pa,30);
      text("SCORE:",20,100);
      text(score,150,100);
      textFont(pa,50);
      text("FAILED",250,275);
      
      if (frameCount-count>50){
 
        if ((mouseX>275)&&(mouseX<425)&&(mouseY>325)&&(mouseY<400)){
          fill(125,0,125,125);
          rect(250,325,465,400);
          textFont(pp,50);
          fill(0,200,200,175);
          text("retry?",300,375);
        }else{
          fill(125,0,125,125);
        rect(275,330,425,400);
        textFont(pp,45);
        fill(0,200,200,175);
        text("retry?",300,375);
        }
        if ((mouseX>275)&&(mouseX<425)&&(mouseY>425)&&(mouseY<500)){
          fill(255,0,125,125);
          rect(250,425,465,500);
          textFont(pp,50);
          fill(255,0,200,175);
          text("menu",300,475);
        }else{
          textFont(pp,45);
          fill(255,0,125,125);
          rect(275,430,425,500);
          fill(200,0,200,175);
          text("menu",300,475);
        }
      }
    }
  }
 public void disp(){
   if (st==1){
   for(int i=150;i<750;i=i+50){
         score=nf(ccc);
     fill(175,0,125,75);
     triangle(i,650,i+50,650,i+25,(650-pos.y/10));
     triangle(i,0,i+50,0,i+25,50-pos.y/10);
   }
   }
 }
}                              
  public void settings() {  size(750,650); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "game1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
