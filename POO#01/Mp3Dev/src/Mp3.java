import javax.swing.JOptionPane;

public class Mp3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao Mp3Dev as mehores músicas para desenvolver o seu sistema");
        String user = JOptionPane.showInputDialog("Como você gostaria de ser chamado(a): ");
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Então " + user + " quantas músicas terá na sua playlist?: "));
        String name = JOptionPane.showInputDialog(user + " fala ai, qual será o nome dessa playlist?: ");
        
        Playlist playlist = new Playlist(capacidade);

        while (true) {
        	 int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                     "Escolha uma opção:\n" +
                             "1. Adicionar música\n" +
                             "2. Listar músicas\n" +
                             "3. Sair"));

            switch (escolha) {
                case 1:
                    String nomeMusica = JOptionPane.showInputDialog("Digite o nome da música: ");
                    playlist.adicionarMusica(nomeMusica);
                    break;
                case 2:
                    playlist.listarMusicas(name, user);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo da palylist");
                   
                    System.exit(0);
                default:
                	JOptionPane.showMessageDialog(null, "Xii, vacilou em" + user + "isso não vale, tente novamente");
            }
        }
    }
}

