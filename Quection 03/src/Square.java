public class Square implements Shape {
    @Override
    public void draw(){
        int L = 5;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
