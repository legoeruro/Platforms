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
 color c=color(random(100,200),random(100,200),random(100,200),70);
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
 int checkb(){
   
   for (int i=to;i<k;i++){
     if ((pos.x>=p[i].pos.x-(p[i].size.x/2))&&(pos.x<=p[i].pos.x+(p[i].size.x/2))&&(pos.y-10>p[i].pos.y-40)&&(pos.y+10<p[i].pos.y+20)){
       return(i);
     }
   }
   return(-1);
   }
   //pmove
   void pmove(boolean checc){
  score=nf(ccc);
  to=k-20;
  if (to<0){
   to=0; 
  }
  for (int i=to;i<k+1;i++){
    p[i].up(ccc);
    p[i].disp(int(i));
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
  void move(){


    int z=0;
    speed.x=speed.x+(ccc/1000000.1);
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
             
            pos.y=pos.y-0.5;
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
    rect(0+1,650-(f/3.333)+1,150,650);
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
 void disp(){
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
