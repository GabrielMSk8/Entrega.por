package Clientes;

public class PessoaJuridica1 extends Cliente {
    private String cnpj;

    public PessoaJuridica1(String cnpj) {
        this.cnpj = cnpj;
    }

    public void PessoaJuridica(String cnpj2) {
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar1(){
        System.out.println("cnpj: " + cnpj);
    }

	public void visualizar() {
		
		
	}
}
