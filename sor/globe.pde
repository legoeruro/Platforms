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
  color m=color(125);
  long count=0;
  int zb=0;
  mm(){
    p=new player(fid.a,fid.r);
    textFont(pc,50);
    textFont(pp,50);
    frameRate(60);
    
  }
  void disp(){
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
          sped-=0.26;
        }else{
          sped=sped+0.2;
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
    text("EASY",362.5,110);
    fill(n.c);
    rect(200,285,525,375);
    fill(0);
    text("NORMAL",362.5,345);
    fill(h.c);
    rect(200,500,525,590);
    fill(0);
    text("HARD",362.5,560);
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
