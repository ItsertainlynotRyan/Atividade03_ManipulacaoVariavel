public class Main {
    public static void main(String[] args) {
        //var
        String produto = "camisas do Real Madri";
        double price = 350.00;
        int quantidade = 3;
        double imposto = (double) 60/ 100;
        double lucro = (double) 25 / 100;

        //val = valor
        // valTtcImposto valor total com imposto
        double valtotal = price + quantidade;
        double valorPorcentagem = price * imposto;
        double valorFinal = price + valorPorcentagem;

        double  lucroDeVenda = lucro * valorFinal;
        double lucroDeVendaFinal = valorFinal + lucroDeVenda;
        System.out.println("Estou vendendo " + quantidade +  " camisas do mengão da europa o Real madri " + produto +
                " o valor total delas sem o imposto é " + price + " Mas como elas são importadas elas têm imoposto de " + (imposto * 100)+
                " % e seu valor com o imposto fica " +  valorFinal+ " como eu preciso ganhar dinheiro têm vou ter que adicionar mais " + (lucro * 100) + " % portanto o valor final ficara " +lucroDeVendaFinal );
    }
}