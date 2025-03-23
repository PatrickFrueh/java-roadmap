import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

class Main {

    public static void main(String[] args) {

        Security.addProvider(new BouncyCastleProvider());

    }
}
