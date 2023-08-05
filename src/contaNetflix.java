public class contaNetflix {
    
    private String idiomaPreferencial;
    private String resolucaotela;

    public void entrar(){
    //pegar as informações do usuario
    //pegar resolução da tela

    buscarIdiomaPreferencialDoUsuario();
    indentificarResolução();

    }

    private void buscarIdiomaPreferencialDoUsuario(){
        idiomaPreferencial = "PT - BR";
    }

    private void indentificarResolução(){
         resolucaotela = "FULL - HD";
    }

    public void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na Resolução " + resolucaotela);
        System.out.println("O audio do filme sera reproduzido em PT - BR");
    }

    /*private void carregarAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial =="EN - US"){
            System.out.println("O filme sera reproduzido no idioma " + idiomaPreferencial);
        }else{
            System.out.println("O audio do filme sera carregado em EN - US ");
        }
    }*/
}
