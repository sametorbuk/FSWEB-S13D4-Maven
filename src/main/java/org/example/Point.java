package org.example;

public class Point {
   private int x;
    private int y;


    public Point(int x , int y){
        this.x = x;
        this.y =y;
    }


    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }



    public int getY(){
        return y;
    }


    public void setY(int y){
        this.y = y;
    }


    public double distance(){
        return Math.sqrt(Math.pow(x , 2) + Math.pow(y,2));

    }



    public double distance(Point p){

        return Math.sqrt(     Math.pow(  ( p.getX()-this.x)   ,2) + Math.pow( (p.getY()-this.y) , 2 )     );

    }



    public double distance(int a , int b){

        return Math.sqrt( (a - this.x)*(a-this.x) + (b-this.y) * (b-this.y)  );

    }







}
