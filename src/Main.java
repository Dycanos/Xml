public class Main {
    public static void main(String[] args) {
        KeyGenerator keyGeneratorAgent1 = new KeyGenerator();
        KeyGenerator keyGeneratorAgent2 = new KeyGenerator();

        Agent agent1 = new Agent(keyGeneratorAgent1);
        Agent agent2 = new Agent(keyGeneratorAgent2);
        System.out.println("|-----------------------------------------------------------| \n" );
        System.out.println("|---------------------------Agent 1-------------------------| \n" );
        System.out.println("Public key: " + agent1.getPublicKey() + "\n");
        System.out.println("Private key: " + agent1.getPrivateKey()+ "\n");

        System.out.println("|-----------------------------------------------------------| \n" );
        System.out.println("|---------------------------Agent 2-------------------------| \n" );
        System.out.println("Public key: " + agent2.getPublicKey());
        System.out.println("Private key: " + agent2.getPrivateKey());
}
}
