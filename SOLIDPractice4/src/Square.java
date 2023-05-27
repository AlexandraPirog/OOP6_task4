public class Square extends ShapesWithAngles {
    private int sideLength;
    public void Square(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public int area() {
        return this.sideLength = sideLength * sideLength;
    }
    //        @Override
//        public void setWidth(int width) {
//            super.width = width;
//            super.height = width;
//        }
//        @Override
//        public void setHeight(int height) {
//            super.width = height;
//            super.height = height;
//        }
}

