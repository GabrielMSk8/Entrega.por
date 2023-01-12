public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("123.456.789-51");
        PessoaFisica pf2 = new PessoaFisica("312.456.789-51");

        PessoaJuridica pj1 = new PessoaJuridica("55.857.731/0001-40");
        PessoaJuridica pj2 = new PessoaJuridica("57.751.767/0001-70");

        pf1.visualizar();
        pf2.visualizar();

        pj1.visualizar();
        pj2.visualizar();
    }
}

//---------------------------------------------------------------------------------

public class Cliente {
}

//---------------------------------------------------------------------------------

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){
        System.out.println("cpf: " + cpf);
    }
}

//---------------------------------------------------------------------------------

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar(){
        System.out.println("cnpj: " + cnpj);
    }
}
