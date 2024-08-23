public class Rectangle implements Shape {
    @Override
    public void draw(){
        int H = 7;
        for (int i = 0; i < H; i++) {
            int W = 4;
            for (int j = 0; j < W; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}}
