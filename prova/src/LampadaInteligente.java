public class LampadaInteligente extends Dispositivo implements DispositivoFactory {

    LampadaInteligente(Dispositivo.DispositivoBuilder build) {
        super(build);
        
    }

    @Override
    public void criarDispositivo() {
       
        throw new UnsupportedOperationException("Unimplemented method 'criarDispositivo'");
    }

  
    
}
