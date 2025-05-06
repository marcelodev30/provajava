public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dispositivo luz = new Dispositivo.DispositivoBuilder().setConectividade("Wifi").setConsumoEnergia(90).setModelo("luz").build();
        Dispositivo smart = new Dispositivo.DispositivoBuilder().setConectividade("Bluetooth").setConsumoEnergia(120).setModelo("Smarttv").build();
    
        GerenciadorDispositivos listaDispositivos = GerenciadorDispositivos.gegetInstanciat();
        listaDispositivos.adicionarDispositivo(smart);
        listaDispositivos.adicionarDispositivo(luz);
        listaDispositivos.adicionarDispositivo(new Dispositivo.DispositivoBuilder().setConectividade("Bluetooth").setConsumoEnergia(20).setModelo("CafeteiraSmart").build());
        listaDispositivos.listarDispositivos();
    }
}
