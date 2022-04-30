package main;

//import classes.Destinatario;
//import classes.Entrega;
//import classes.Envio;
//import classes.Mercadoria;
import classes.Remetente;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu = 1;
        while(menu != 6){
            System.out.println(
                    "_________________________________ MENU _________________________________" +
                    "\n| !! DIGITE A OPÇÃO E APERTE ENTER !!                                  |" +
                    "\n| 1 - REMETENTE                                                        |" +
                    "\n| 2 - DESTINATÁRIO                                                     |" +
                    "\n| 3 - MERCADORIA                                                       |" +
                    "\n| 4 - ENTREGA                                                          |" +
                    "\n| 5 - ENVIO                                                            |" +
                    "\n| 6 - SAIR                                                             |" +
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"
            );
            menu = sc.nextInt();
        }
        // Adicionar
        Remetente remadc = new Remetente(0);
        
        remadc.setRemetente("Eduardo");
        remadc.setCpfcnpj("123.456.789-10");
        remadc.setCep("02468-642");
        remadc.setLogradouro("Avenida Campos");
        remadc.setNumero("30");
        remadc.setBairro("Paraíso");
        remadc.setCidade("São Paulo");
        remadc.setEstado("SP");
        remadc.setTelefone("(11)99342-9919");
        remadc.setEmail("eduardo@email.com");
        remadc.adicionar();
        
        remadc.setRemetente("AirGuns");
        remadc.setCpfcnpj("12.345.678/0000-01");
        remadc.setCep("55255-444");
        remadc.setLogradouro("Travessa Bela Vista");
        remadc.setNumero("1456");
        remadc.setBairro("Horizonte");
        remadc.setCidade("Curitiba");
        remadc.setEstado("PR");
        remadc.setTelefone("(46)98413-0024");
        remadc.setEmail("contato@airguns.com");
        remadc.adicionar();
        
        remadc.setRemetente("NumisCoin");
        remadc.setCpfcnpj("58.956.000/0458-51");
        remadc.setCep("68903-430");
        remadc.setLogradouro("Avenida Professor Caramuru");
        remadc.setNumero("358");
        remadc.setBairro("Zerão");
        remadc.setCidade("Macapá");
        remadc.setEstado("AP");
        remadc.setTelefone("(96)98142-5060");
        remadc.setEmail("moedas@NumisCoin.com");
        remadc.adicionar();
        
        // Listar
        ArrayList<Remetente> remetentes = Remetente.listar();
        
        for(Remetente remlist:remetentes){
            int id = remlist.getId();
            String remetente = remlist.getRemetente();
            String cpfcnpj = remlist.getCpfcnpj();
            String cep = remlist.getCep();
            String logradouro = remlist.getLogradouro();
            String numero = remlist.getNumero();
            String bairro = remlist.getBairro();
            String estado = remlist.getEstado();
            String cidade = remlist.getCidade();
            String telefone = remlist.getTelefone();
            String email = remlist.getEmail();
            
            System.out.println(
                    "________________________________________________________________________" +
                    "\nID: " + id +
                    "\nRemetente: " + remetente +
                    "\nCPF/CNPJ: " + cpfcnpj +
                    "\nEndereço: " + logradouro + ", " + numero + " - " + bairro + 
                    "\n          " + cidade + "-" + estado + ", " + cep +
                    "\nTelefone: " + telefone +
                    "\nEmail: " + email +
                    "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n"
            );
        }
        
        // Atualizar
        /*Remetente rem = new Remetente(1);
        rem.setRemetente("Eduardo");
        rem.setCpfcnpj("123.456.789-10");
        rem.setCep("02468-642");
        rem.setLogradouro("Av. Campos");
        rem.setNumero("30");
        rem.setBairro("Paraíso");
        rem.setEstado("São Paulo");
        rem.setCidade("São Paulo");
        rem.setTelefone("(11)99342-9919");
        rem.setEmail("eduardo@email.com");
        rem.atualizar();*/
        
        // Deletar
        Remetente rem = new Remetente(1);
        rem.excluir();
        
    }
    
}
