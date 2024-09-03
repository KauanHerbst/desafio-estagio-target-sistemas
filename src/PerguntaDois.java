public class PerguntaDois {
    // 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
    // além de informar a quantidade de vezes em que ela ocorre.

    public static void main(String[] args) {
        String str = "A target é a melhor"; // String a ser verificada

        if(str.toLowerCase().contains("a")){
            int ocorrencia = 0;
            for (int i=0; i< str.length();i++){
                if(str.toLowerCase().charAt(i) == 'a'){
                    ocorrencia++;
                }
            }
            System.out.println("A letra 'a' apareceu " + ocorrencia + " vezes na string informada");
        }
    }

}
