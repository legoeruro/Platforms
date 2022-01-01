class plat{
  PVector size= new PVector();
  PVector pos=new PVector();
  color c=color(random(125,200),random(125,200),random(125,200));
  int d;
  plat(int diff,long count,boolean b){
    pos.y=random(650,850);
    size.x= 250/diff/round(count/10000.1+1);
    if (b){
    pos.x=random(150+size.x,width-size.x);
    }else{
      pos.x=random(size.x,width-size.x);
    }
    size.y=40;
    d=diff;
  }
  void up(long count){
    pos.y=pos.y-2*(count/10000.1+1)*d;
  }
  void disp(long count){
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
