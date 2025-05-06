public class Dispositivo {
    private String modelo;
    private String Conectividade;
    private int consumoEnergia;
    private String cor;

    Dispositivo(DispositivoBuilder build){
        this.modelo= build.modelo;
        this.Conectividade = build.Conectividade;
        this.consumoEnergia= build.consumoEnergia;
        this.cor= build.cor;
    }

    String getModelo(){
        return this.modelo;
}
    String getConectividade(){
        return this.Conectividade;
}
    int getConsumoEnergia(){
        return this.consumoEnergia;
}

    String getCor(){
        return this.cor;
}
    public static class DispositivoBuilder {
        private String modelo;
        private String Conectividade;
        private int consumoEnergia;
        private String cor;
    
        public DispositivoBuilder(){};
    
        public DispositivoBuilder setModelo(String value){
            this.modelo = value;
            return this; 
        }
        public DispositivoBuilder setConectividade(String value){
            this.Conectividade = value;
            return this; 
    
        }
        public DispositivoBuilder setConsumoEnergia(int value){
            this.consumoEnergia = value;
            return this; 
        }
        public DispositivoBuilder setCor(String value){
            this.cor = value;
            return this; 
        }
        public Dispositivo build(){
            return new Dispositivo(this);
        }
    }
    

    
} 