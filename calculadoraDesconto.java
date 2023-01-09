public class calculadoraDesconto {
    public static void main(String[] args) throws Exception {
     double valorCompra = 1800;
     double valorPagar = valorCompra <= 1000 ? valorCompra :
                         valorCompra <= 3000 ? valorCompra * 0.95 :
                       valorCompra * 0.90;
     
    
     
     
        System.out.println("O valor da compra é:" + valorCompra);
        System.out.println("O valor a pagar é:" + valorPagar);
    }
}
