public class Principal {

    public static void main(String args[]){

    Novo novo=new Novo();
    Velho velho=new Velho();
    
    novo.setEndereco("Vitor Euzebio da Silva");
    novo.setPreco(250000);
    novo.setAdicionalPreco((0.2*novo.getPreco()));
    System.out.println("Preço imovel novo: R$"+(novo.getPreco()+novo.getAdicionalPreco()));

    velho.setEndereco("Av Sampaio Vidal");
    velho.setPreco(230000);
    velho.setDescontoPreco(0.1*velho.getPreco());
    System.out.println("Preço imovel velho: R$"+(velho.getPreco()- velho.getDescontoPreco()));
    }
}
