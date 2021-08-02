package collections_11_06;

public class estoque {
	
	private String produto;
	private String marcaProd;
	private int codBarras;
	private double valorProd;
	
	
	public estoque( String produto, String marcaProd, int codBarras, double valorProd) {
		super();
		this.produto = produto;
		this.marcaProd = marcaProd;
		this.codBarras = codBarras;
		this.valorProd = valorProd;
		
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarcaProd() {
		return marcaProd;
	}
	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}
	public int getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}
	public double getValorProd() {
		return valorProd;
	}
	public void setValorProd(int valorProd) {
		this.valorProd = valorProd;
	}

	@Override
	public String toString() {
		return "estoque [produto =" + this.produto + ", marcaProd =" + marcaProd + ", codBarras =" + codBarras + ", valorProd ="
				+ valorProd + "]";
	}
	
	

}
