public class Commodities{
    public static void main(String[] args){
        String produto[] = new String[5];
        produto[0]= "(60Kg) de Café";
        produto[1]= "(60Kg) de Arroz";
        produto[2]= "(60Kg) de Trigo";
        produto[3]= "(50Kg) de Açucar";
        produto[4]= "(60Kg) de Milho";

        int preco[] =new int[5];
        preco[0]=1236;
        preco[1]=100;
        preco[2]=94;
        preco[3]=143;
        preco[4]=110;
     

        for(int index = 0; index < produto.length; index++){
            System.out.println("O Preço da saca"+ produto[index]+" em Abril de 2022 é "+ "R$"+ preco[index]+",00");

        }

    }
}