public class Main{ //função principal
    public static void main(String[] args) { //função estatica passando uma array de strings

        //Declaração de variavel: Tipo de Dado + Indentificação + Valor atribuido
        String nome = "Lucas Mesquita Rage";
        //regra: Declarar a variavel com o nome começando com letra minuscula, apenas se tiver uma segunda letra
        //ex: nomeSobrenome ou pode fazer nome_Sobrenome ou nome_sobrenome
        System.out.println(nome);

        //Tipo de VAriavel:
        /*
        byte: -128 a 127 (1byte de informação ou 8 bit)
        short: -32769 a 32767 (2 bytes de informação ou 16 bit)
        int: -2147483648 a 2147483647 (4 bytes de informação ou 32 bits)
        long: -9223372036854775808 a 9223372036854775807 (8 bytes de informação ou 64 bits)

        Numeros Decimais:
        float: 7 casas decimais -1234567 (4 bytes de informação ou 32 bits)
        double: 15 casas decimais 123456789123456 (8 bytes de informação ou 64 bits

        String: vai receber textos == palavras e frases
        char: Suporta apenas um unico caracter
         */

        byte idade = 120;
        short estoque = 32767;
        int numero = 2147483647;
        long contaCorrente = 9223372036854775807L;
        float real = 10.1234567f;
        double dolar = 5.123456789123456;
        String nome2= "Lmg64bit";
        char inicial = 'L';
        boolean botao = true;
        //teste das variaveis acima:
        System.out.println();

        //Metodo diferente
        var sobrenome = "Rage"

    }
}