package gt.edu.url.examen1.api;

import gt.edu.url.examen1.impl.Monstruo;

/**
 *
 * @author Victor Orozco
 */
public interface FabricaRanger {
    
    public void hacerAlgo();
    
    public boolean apilar(Monster monstruo);
    public boolean desapilar(Monster monstruo);
    public boolean encolar(Monster monstruo);
    public boolean desencolar(Monster monstruo);
    public Monster fabricar(String elemento);
}
