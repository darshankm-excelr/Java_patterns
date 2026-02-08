class Box{
  double width;
  double height;
  double depth;
  double volume(){
     return width*height*depth;
    
  }
}
class Practice{
    public static void main(String args[]){
        Box mybox=new Box();
        mybox.width=12;
        mybox.height=10;
        mybox.depth=10;
       System.out.println( mybox.volume());

    }
}