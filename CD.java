
public class CD {

	String artista;
	double preco;
	String nome;
	int qtd;
	
	
	public CD(String n, double p, String a, int q) {
		nome  	= n;
		preco   = p;
		artista	= a;
		qtd		= q;
	}
	
	public double compraCD(double qtd) {
		double valCompra = (this.preco * qtd);
		return valCompra;
	}

}
