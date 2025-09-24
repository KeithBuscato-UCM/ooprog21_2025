public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        
        // Corrected assignment: set length to the length parameter instead of width
        this.length = length;  
        
        // Corrected assignment: set height to the height parameter instead of width
        this.height = height;  
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        double vol = length * width * height;
        return vol;
    }
}