package java_multithreading.level_2.snake;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;
    static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public static void main(String[] args) {
        Snake snake1 = new Snake(0, 0);
        snake1.setDirection(SnakeDirection.DOWN);
        game = new Room(0,0,snake1);
        game.createMouse();
        game.run();

    }

    public void run() {

    }

    public void print() {

    }

    public void createMouse() {
        int x = (int) (Math.random()*width);
        int y = (int) (Math.random()*height);
        mouse = new Mouse(x,y);
        setMouse(mouse);
    }

    public void eatMouse() {
        createMouse();
    }

    public void sleep() {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
