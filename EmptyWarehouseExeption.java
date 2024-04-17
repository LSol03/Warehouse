public class EmptyWarehouseExeption extends Exception{
    EmptyWarehouseExeption() { super("There are not so much material."); }
}