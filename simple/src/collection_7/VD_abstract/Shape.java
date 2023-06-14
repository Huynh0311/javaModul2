package collection_7.VD_abstract;

abstract public class Shape {
    protected int x, y;
    protected Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo(int x, int y){
        erase();
        this.x = x;
        this.y = y;
        draw();
    }
}
