import java.util.ArrayList;
import java.util.List;

public class prueba1 {

    public static void main (String [] args ){

        List<String>nombres= new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Maria");
        nombres.add("Jose");

        String textoLargo= "Necesito escribir un texto largo AQUÍ_VAN_LOS _NOMBRES para sustituir AQUÍ_VAN_LOS _NOMBRES pero tampoco se me ocurren muchas cosas que escirbir " +
                "asi que espero que sea este AQUÍ_VAN_LOS _NOMBRES  lo suficientemente largo AQUÍ_VAN_LOS _NOMBRES";
        System.out.println(cambiarPlaceHolderPorNombre(textoLargo, nombres));

    }


    public static String cambiarPlaceHolderPorNombre (String textoLargo, List<String>nombres){

        String textoresultado = textoLargo.replaceAll("AQUÍ_VAN_LOS _NOMBRES",iterarLista(nombres));

        return textoresultado;
    }

    public static String iterarLista(List<String>nombres){

        String cadenanombres="";

        for(String name : nombres){

            if(cadenanombres==""){
                cadenanombres = name;
            }else{
                cadenanombres += ", " + name;
            }
        }
        return cadenanombres + ".";
    }
}
