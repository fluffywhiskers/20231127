import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /* DO/WHILE 
            EXERCICIO 1
        int tempoAssistido = 0;

        System.out.println("Bem-vindo à sessão de cinema virtual!");

       
        while (tempoAssistido < 120) {
            System.out.println("Você está assistindo ao filme. Digite 'parar' para encerrar a sessão.");
            
            String comando = scanner.nextLine();

       
            if (comando.equalsIgnoreCase("parar")) {
                break; 
            }

          
            tempoAssistido += 10;
        }


        System.out.println("Sessão encerrada. Obrigado por assistir!");
        
       */
    

        /*EXERCICIO 2 
        int contador=1;
        int maximoDeUsuarios=0;
        System.out.println("Bem vindo ao Sistema:");
        do {
             try{
                String[] array=new String[10];
                System.out.print("Digite seu nome de usuário:");
                String usuario=scanner.nextLine();
                Thread.sleep(1000);
                array[contador]=usuario;
                
                System.out.println("Usuário conectado:"+array[contador]);
                System.out.println("Número de usuários conectados:"+contador++);
            }catch(InterruptedException e){
                e.getStackTrace();
            }
        } while (maximoDeUsuarios<10)
        */
        /* EXERCICIO 3
        List<String> frutas=new ArrayList<>();
        boolean sair=false;
        String saida;
        while (sair==false) {
                System.out.println("Digite o nome de uma fruta:");
        String fruta=scanner.nextLine();
        if(fruta!=""){
            frutas.add(fruta);
        }
        else{
            System.out.println("Digite um nome válido");
       
        }
        System.out.println("Deseja digitar mais algum nome de fruta?");
        System.out.println("Digite S  para continuar ou digite N para sair:");
        saida=scanner.nextLine().toUpperCase();
        if(saida.equals("N")){
            break;
        }
        System.out.println("Foram adicionadas"+frutas.size()+"frutas,quais sejam:"+frutas);
     }
     */
    

     /*EXERCICIO 4 
    public static void main(String[] args) {
        Scanner scQtd = new Scanner(System.in);
        Scanner scOption = new Scanner(System.in);
        Scanner scCode = new Scanner(System.in);

        String[] productsNames = {"Maçã (kg)","Pão (Un)","Sabão 2kg (Un)","Coca-Cola (2L)","Chocolate (Barra)"};
        double[] productsPrices = {7.5,0.5,27.86,8.99,3.89};

        short productCode;
        short productQtdi = 0;
        double productQtd;
        List<Short> productCodeList = new ArrayList<>();
        List<String> productNamesList = new ArrayList<>();
        List<Double> productPriceList = new ArrayList<>();
        List<Double> productQtdList = new ArrayList<>();
        List<Double> productSubtotalList = new ArrayList<>();

        short idProductTemp;
        boolean listLimit = false;

        while (listLimit == false) {
            idProductTemp = 0;
            while (idProductTemp < productsNames.length) {
                System.out.println("Códig [" + idProductTemp + "] - Produto: " + productsNames[idProductTemp]);
                idProductTemp++;
            }
            System.out.println("Digite o código do produto que deseja adicionar ao carrinho: ");
            productCode = scCode.nextShort();

            productCodeList.add(productCode);
            productNamesList.add(productsNames[productCode]);
            productPriceList.add(productsPrices[productCode]);
            
            System.out.println("Digite a quantidade do produto desejado: ");
            productQtd = scQtd.nextDouble();
            productQtdList.add(productQtd);
            productSubtotalList.add(productQtd * productsPrices[productCode]);

            productQtdi++;
            
            if (productQtdi == productsNames.length) {
                listLimit = true;
            }

            System.out.println("Deseja adicionar mais algum produto? Y = Sim N = Não ");
            if (scOption.nextLine().toUpperCase().equals("N")) {
                break;
            }
        }

        scQtd.close();
        scOption.close();
        scCode.close();

        short idProductTempList = 0;
        double totalPrice = 0.0;

        while (idProductTempList < productNamesList.size()) {
            System.out.println(
            "Códig [" + productCodeList.get(idProductTempList) + 
            "] | Produto: " 
            + productNamesList.get(idProductTempList) + 
            " | Preço: " + productPriceList.get(idProductTempList) +
            " | Quantidade: " + productQtdList.get(idProductTempList) + 
            " | Subtotal: " + 
            productSubtotalList.get(idProductTempList)
            );
            totalPrice += productSubtotalList.get(idProductTempList);
            idProductTempList++;
        }
        
        System.out.println("Total da compra: R$ " + totalPrice);
    }
}
    */
}
}