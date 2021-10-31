package T3H.Buoi2;

public class Rectangle {
    private int lenght, width;

    public Rectangle(){

    }

    public Rectangle(int lenght, int width){
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int lenght){
        this.lenght = lenght;
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getArea(){
        return this.lenght * this.width;
    }
    public String toString(){
        return "Rectagle[ lenght = " + this.lenght + "; width = " + this.width + "; Area = " + getArea() + "]";
    }

}
