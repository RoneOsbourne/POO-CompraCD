import javax.swing.JOptionPane;

public class loja {

	public static void main(String[] args) {
		CD CDs[] = new CD[100];
		
		String cDNome = "";
		String cDPreco = "";
		String cDArtista = "";
		String cDQtd = "";
		String qtdTotal = "";
		
		for(int i = 0; i < 100; i++) {
			
			qtdTotal = JOptionPane.showInputDialog("Informe a quantidade desejada: ");						
			cDNome    = JOptionPane.showInputDialog("Digite o nome do CD: ");
			cDPreco   = JOptionPane.showInputDialog("Digite o preco: ");
			cDArtista = JOptionPane.showInputDialog("Digite o Artista: ");
			cDQtd 	  = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
					
			CDs[i] = new CD (cDNome, Double.parseDouble(cDPreco), cDArtista, Integer.parseInt(cDQtd));
			
			}
						
		for(int j = 0; j < CDs.length; j++) {
			int cDQtd1 = Integer.parseInt(cDQtd);
			
			System.out.println("Comprado(s): " + CDs[j].qtd + " do CD: " + CDs[j].nome);
			System.out.println("Preço unitário: " + CDs[j].preco);
			System.out.println("Artista: " + CDs[j].artista);
			System.out.println("Valor: " + CDs[j].compraCD(cDQtd1));
			System.out.println("--------------");
		
			}
				
		}
}