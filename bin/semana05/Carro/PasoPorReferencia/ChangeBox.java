public class ChangeBox {
    public void changeBox(Box box) {
        box.size = 20;
    }
    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println(box.size);
        ChangeBox changeBox = new ChangeBox();
        changeBox.changeBox(box);
        System.out.println(box.size);
    }
}
