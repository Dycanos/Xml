import java.security.PrivateKey;
import java.security.PublicKey;

public class Agent {
    protected KeyGenerator keyGenerator;

    public Agent(KeyGenerator key){
        this.keyGenerator = key;
    }

    public PublicKey getPublicKey(){
        return keyGenerator.getPublicKey();
    }

    public PrivateKey getPrivateKey(){
        return keyGenerator.getPrivateKey();
    }

}
