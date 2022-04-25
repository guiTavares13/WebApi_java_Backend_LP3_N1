package pkg_autor;


public class Autor {
	private int id;
	private String nome;
	private String descricao;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setId(String id) {
		if (id == null) {
			setId(0);
		} else {
		 setId(Integer.valueOf(id));
		}
	}
	
	public String getName() {
		return this.nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
