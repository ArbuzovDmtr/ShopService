void main() {


    OrderRepo newList = new OrderListRepo();


    ProductRepo newRepOfProducts = new ProductRepo();
    newRepOfProducts.addProduct(new Product("cucumber", 4.2, 1));
    newRepOfProducts.addProduct(new Product("tomato", 6.13, 2));
    newRepOfProducts.addProduct(new Product("paprika", 3.22, 3));
    newRepOfProducts.addProduct(new Product("cheese", 9.99, 4));
    newRepOfProducts.addProduct(new Product("bacon", 5.89, 5));


    ShopService shop = new ShopService(newList, newRepOfProducts);


    Map<Integer, Integer> MapOfCurrentOrder = new HashMap<>();


    Scanner scanner = new Scanner(System.in);
    String input;
    IO.println("cucumber ID 1, tomato ID 2, paprika ID 3," + '\n' +
            " cheese ID 4, bacon ID 5, chicken ID 6, coke ID 7 ");


    while (true) {
        IO.println("Enter \"+\" if you want add another product, if your Order is ready, enter Q: ");
        input = scanner.next();
        if ("+".equals(input)) {
            IO.println("Enter product ID:");
            int number1 = scanner.nextInt();
            IO.println("Enter product quantity:");
            int number2 = scanner.nextInt();
            MapOfCurrentOrder.put(number1, number2);
        } else if ("q".equalsIgnoreCase(input)) {
            IO.println("Your Order is ready");
            break;
        } else {
            IO.println("Choose \"'+'\" or q");
        }


    }


//        MapOfCurrentOrder.put(1,7);
//        MapOfCurrentOrder.put(7,6);
//        MapOfCurrentOrder.put(4,12);
//        totalSum =149.28

    shop.newOrder(1, MapOfCurrentOrder);
    IO.println(shop.getOrderRepo());
    IO.println(shop.getOrderRepo().getOrderById(1).TotalSum());


}
