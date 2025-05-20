public package facade;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = "São Paulo"; // simula chamada externa
        String estado = "SP";        // simula chamada externa

        System.out.println("Cliente migrado: " + nome + " - " + cidade + "/" + estado + " - CEP: " + cep);
    }
}
 {
    
}
