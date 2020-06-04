public class Twofer {
    public String twofer(String name) {
        String result = name != null && name.length() >0 ? name : "you";
        return String.format("One for %s, two for me.", result);
    }
}
