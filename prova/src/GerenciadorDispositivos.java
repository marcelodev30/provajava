import java.util.ArrayList;
import java.util.List;

public class GerenciadorDispositivos {
    private List<Dispositivo> dispositivos;
    private static GerenciadorDispositivos instancia;


private GerenciadorDispositivos(){
    dispositivos = new ArrayList<>();
}

public static GerenciadorDispositivos gegetInstanciat(){
    return instancia;
}

public void adicionarDispositivo(Dispositivo dispositivo){
    dispositivos.add(dispositivo);
}

public void listarDispositivos(){
    System.out.println("Lista de dispositivo add");
    for (int i=0; i <= dispositivos.size();i++){
        System.out.println(dispositivos.get(i));
    }

}
}