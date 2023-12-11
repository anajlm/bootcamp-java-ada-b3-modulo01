public class Q2_ConverterTemperatura {

    public static void main(String[] args) {
        converterTemperatura(100, "celsius", "kelvin");
    }
    
    public static void converterTemperatura(double temperaturaAtual, String medidaAtual, String medidaFinal){

        double output = 0;

        switch(medidaAtual){
            case "celsius":
                switch(medidaFinal){
                    case "kelvin":
                        output = temperaturaAtual + 273.15;
                        break;
                    case "farenheit":
                        output = temperaturaAtual*(9.0/5.0) + 32.0;
                        break;
                }
                break;

            case "kelvin":
                switch(medidaFinal){
                    case "celsius":
                        output = temperaturaAtual - 100.0;
                        break;
                    case "farenheit":
                        output = (temperaturaAtual - 100.0)*(9.0/5.0) + 32.0;
                        break;
                }
                break;

            case "fahrenheit":
                switch(medidaFinal){
                    case "celsius":
                        output = (temperaturaAtual - 32.0)*(5.0/9.0);
                        break;
                    case "kelvin":
                        output = (temperaturaAtual - 32.0)*(5.0/9.0) + 100.0;
                        break;
                }
                break;

        }

        System.out.println("Temperatura atual = " + temperaturaAtual);
        System.out.println("Medida atual = " + medidaAtual);
        System.out.println("Medida final = " + medidaFinal);
        System.out.printf("Output = %.2f %n", output);

    }
}
