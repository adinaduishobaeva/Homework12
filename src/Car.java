public class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("машина жабылып жатат ");
    }

    public void drive() {
        System.out.println("Машина журуп жатат ");

    }
}
